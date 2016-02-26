import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author (Matt Schnider)
 * @version 0.1
 */
public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!
    
    /**
     * Default constructor for testing purposes.
     */
    public Greep()
    {
        this(null);
    }

    
    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }
    

    /**
     * Do what a greep's gotta do.
     */
    public void act()
    {
        super.act();   // do not delete! leave as first statement in act().
        if (carryingTomato()) {
            if(atShip()) {
                dropTomato();
                turn(180); // turns 180 degrees to go back to the tomato pile.
            }
            else {
                if (atWater())
                {
                    turn(140);
                }   
  
                if (atWorldEdge())
                    turn(130);
                  
                
                move();
                spit("orange"); //spits orange showing the path back to the tomatoes
                turnHome();
 
            }   
        }
       else {
            if (seePaint("purple")){
            turn(90); //Causes a greep to wait for another greep at a tomato pile until a friend passes by
            move();   //to help him load the tomatoes.
            turn(90);
            move();
            turn(90);
        }
         
            if (atWater())
                turn(130);
            if (atWorldEdge())
                turn(134);
           
            move();
            checkFood();
        
        }
    }

    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if(tomatoes != null) {
            loadTomato();
            spit("purple"); //Spits purple if near tomatoes, causing the greep to wait for another greep.
        
           // Note: this attempts to load a tomato onto *another* Greep. It won't
            // do anything if we are alone here.
        }
    }

 
    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "Matt Schnider";  // write your name here!
    }


    /**
     * This method specifies the image we want displayed at any time. (No need 
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if(carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }
}