import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Sam Frack
 * @version 8/26/2021
 */
public class Crab extends Actor
{
    //This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
        turn(4);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
           turn(-4); 
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }

        
    //Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
        
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }


}
