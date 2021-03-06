import greenfoot.*; 

public class Turtle extends Animal
{
    private int powerUp = 0;
    private int points = 0;
    private Counter counter;
    public static boolean isSuperTurtle = false;
    public static boolean lastTurtleStanding = false;
    private int playTrack = 0;
    private int turnRate = 5;
    public static int lettuce = 10;
   
    public Turtle(Counter pointCounter)
    {
       counter=pointCounter;
      
    } 
    
    public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
        tryToEatBug();
        tryToEatCherry();
       
        if( powerUp <= 0)
        {
            setImage("turtle.png");
            isSuperTurtle = false;
            //playTrack = 0;
            turnRate = 5;
  
        }
        else
        {
            
            superTurtle();
            playTrack = 0;
            isSuperTurtle = true;
            turnRate = 15;
            move(7);
            powerUp = powerUp - 1;
        }
        if(lastTurtleStanding == true)
        {
            
            if(playTrack == 1)
           {   
               
               Greenfoot.playSound("Alarm.wav");
               playTrack = playTrack - 1;
           }    
            
            getWorld().setBackground("board.jpg"); 
            
        }
       
        
      
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
            lettuce = lettuce--;
            counter.add(1);
             
            if(counter.getValue() >= 29 && isSuperTurtle == false)
            {
              playTrack = 1;
              lastTurtleStanding = true;
            }
        }
    }
    
    public void tryToEatBug()
    {
        if(canSee(Bug.class))
        {
           eat(Bug.class);
           counter.add(5);
           Greenfoot.playSound("smw_power-up.wav");
           powerUp = 150;
           playTrack = 1;
        if(getWorld().numberOfObjects() == 5)
            {
              powerUp = 0;
              isSuperTurtle = false;
              lastTurtleStanding = true;
            }
           if(powerUp >  0 && counter.getValue() < 29)
           {
            superTurtle();
            
        }
       
    }
    }
    
    public void superTurtle()
    {
        setImage("turtle2.png");
        if(playTrack == 1 && isSuperTurtle == false && lastTurtleStanding == false)
        {
            Greenfoot.playSound("mario1.wav");
            playTrack = playTrack - 1;
        }
        
        if(counter.getValue() >= 29)
            {
              playTrack = 1;
              lastTurtleStanding = true;
            }
    }
    public void tryToEatCherry()
    {
       if( lastTurtleStanding == true && canSee(Snake.class) )
       { 
            eat(Snake.class);
            Greenfoot.playSound("slurp.wav");
            counter.add(25);
             if(getWorld().numberOfObjects() == 2)
        {   
            lastTurtleStanding = false;
            Greenfoot.stop();
        }
       }
}
}
