import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Color;

/**
 * This is Earth. Or at least some remote, uninhabited part of Earth. Here, Greeps can
 * land and look for piles of tomatoes...
 * 
 * @author Michael Kolling
 * @version 1.0
 */
public class Earth extends World
{
    public static final int RESOLUTION = 1;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static final int SCORE_DISPLAY_TIME = 240;

    private GreenfootImage map;
    private Ship ship;
    private int currentMap;
    
    private int[][][] mapData = {
        { {480, 100, 0},{48000, 100, 480}, {48000, 140, 500},  },
 
        { {480, 100, 0}, {48000, 100, 480}, {48000, 140, 500}, },   // map 1
           
          
        { {272, 394, 0}, {27200, 394, 272}, {27200, 430, 292},}
        };

    private int[] scores;
    
    /**
     * Create a new world. 
     */
    public Earth()
    {
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION);
        currentMap = 0;
        scores = new int[mapData.length];    // one score for each map
        showMap(currentMap);
    }
    
    /**
     * Return true, if the specified coordinate shows water.
     * (Water is defined as a predominantly blueish color.)
     */
    public boolean isWater(int x, int y)
    {
        Color col = map.getColorAt(x, y);
        return col.getBlue() > (col.getRed() * 2);
    }
    
    /**
     * Jump to the given map number (1..n).
     */
    public void jumpToMap(int map)
    {
        clearWorld();
        currentMap = map-1;
        showMap(currentMap);
    }
    
    /**
     * Set up the start scene.
     */
    private void showMap(int mapNo)
    {
        map = new GreenfootImage("map" + mapNo + ".jpg");
        setBackground(map);
        Counter mapTitle = new Counter(Greep.getAuthorName() + " - Map ", mapNo+1);
        addObject(mapTitle, 200, 20);
        int[][] thisMap = mapData[mapNo];
        for(int i = 1; i < thisMap.length; i++) {
            int[] data = thisMap[i];
            addObject(new TomatoPile(data[0]), data[1], data[2]);
        }
        int[] shipData = thisMap[0];
        ship = new Ship(shipData[0]);
        addObject(ship, shipData[1], shipData[2]);
    }
    
    /**
     * Game is over. Stop running, display score.
     */
    public void mapFinished(int time)
    {
        displayScore(time);
        wait(SCORE_DISPLAY_TIME);
        clearWorld();
        currentMap++;
        if(currentMap < mapData.length) {
            showMap(currentMap);
        }
        else {
            displayFinalScore();
            Greenfoot.stop();
        }
    }

    private void displayScore(int time)
    {
        int points = ship.getTomatoCount() + time;
        scores[currentMap] = points;
        ScoreBoard board = new ScoreBoard(Greep.getAuthorName(), "Map " + (currentMap+1), "Score: ", currentMap, scores);
        addObject(board, getWidth() / 2, getHeight() / 2);
    }
    
    private void displayFinalScore()
    {
        clearWorld();
        ScoreBoard board = new ScoreBoard(Greep.getAuthorName(), "Final score", "Total: ", scores);
        addObject(board, getWidth() / 2, getHeight() / 2);
    }
    
    private void clearWorld()
    {
        removeObjects(getObjects(null));
    }
    
    private void wait(int time)
    {
        for (int i = 0; i < time; i++) {
            Greenfoot.delay(1);
        }
    }
}