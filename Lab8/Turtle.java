import greenfoot.*; 

public class Turtle extends Animal
{
    private int powerUp = 0;
    public static boolean isSuperTurtle = false;
    private int playTrack = 0;
    private int turnRate = 5;
    public static int lettuce = 10;
    
    public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
        tryToEatBug();
        if( powerUp <= 0)
        {
            setImage("turtle.png");
            isSuperTurtle = false;
  
        }
        else
        {
            
            superTurtle();
            isSuperTurtle = true;
            turnRate = 7;
            move(7);
            powerUp = powerUp - 1;
        }
       System.out.println(isSuperTurtle);
    }
    
    /**
     * Check whether the control keys are being pressed, and turn
     * if they are.
     */
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-turnRate);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(turnRate);
        }
    }
    
    /**
     * Check whether we can see Lettuce. If we can, eat it.
     */
    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class) )
        {
            eat(Lettuce.class);
            Greenfoot.playSound("slurp.wav"); 
            lettuce = lettuce - 1;
            System.out.println(lettuce);
        }
    }
    
    public void tryToEatBug()
    {
        if(canSee(Bug.class))
        {
           eat(Bug.class);
           Greenfoot.playSound("smw_power-up.wav");
           powerUp = 150;
           playTrack = 1;
           if(powerUp >  0)
           {
            superTurtle();
        }
    }
    }
    
    public void superTurtle()
    {
        setImage("turtle2.png");
        if(playTrack == 1 && isSuperTurtle == false)
        {
            Greenfoot.playSound("mario1.wav");
            playTrack = playTrack - 1;
        }
       
    }
}
