import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(600, 480, 1);
        int randomX = Greenfoot.getRandomNumber(560);
        int randomY = Greenfoot.getRandomNumber(150);
        int width = getWidth();
        int height = getHeight();
        
        
        addObject(new Turtle(),randomX,randomY);
        
        addObject(new Snake(), 0, 300);
        addObject(new Snake(), 300, 200);
        addObject(new Snake(), 599, 479);
        
        addObject(new Bug(), 50, 300);
        addObject(new Bug(), 500, 400);
        addObject(new Bug(), 200, 300);
        addObject(new Bug(), 100, 400);
        
        addObject(new Lettuce(), width/4, height/8);
        addObject(new Lettuce(), width/8, height/2);
        addObject(new Lettuce(), width/2, height/4);
        addObject(new Lettuce(), 3*width/4, 3*height/4);
        addObject(new Lettuce(), 2*width/3, height/3);
        addObject(new Lettuce(), 5*width/8, height/8);
        addObject(new Lettuce(), 7*width/8, 6*height/2);
        addObject(new Lettuce(), 6*width/2, 3*height/4);
        addObject(new Lettuce(), 3*width/4, 3*height/4);
        addObject(new Lettuce(), width, height);
        
        
       // populateWorld();
     //add your populateWorld method here
    }

    
}