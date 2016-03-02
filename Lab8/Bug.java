import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Animal
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    
     **/
    private int count = 30;
    public void act() 
    {
      

        int randomVal = Greenfoot.getRandomNumber(7);
        if(count >= 15)
        {
            turn(randomVal);
            move(4);
            count--;
        }
        if(count < 15 && count > 0)
        {
            turn(-randomVal);
            move(4);
            count--;
        }
        if(count == 0)
            count = 30;
        if (atWorldEdge()){
            turn(10);
        }
    }    
}
