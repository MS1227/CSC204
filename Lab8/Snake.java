import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A snake in my game that can eat turtles.
 * 
 * @author mik
 * @version 1.0
 */
public class Snake extends Animal 
{
    private int count = 30;
    public void act()
    {
        int randomVal = Greenfoot.getRandomNumber(5);
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
       
        turnAtEdge();
        tryToEatTurtle();
    }
    
    
    
    /**
     * If we reach the edge of the world, turn a little bit.
     */
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(7);
        }
    }
    
    /**
     * Check whether we can see Lettuce. If we can, eat it.
     */
   
    public void tryToEatTurtle()
    {
        
        if (canSee(Turtle.class) && Turtle.isSuperTurtle == false && Turtle.lettuce !=0)
        {
            eat(Turtle.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
         }
     
    }
    
 
}
