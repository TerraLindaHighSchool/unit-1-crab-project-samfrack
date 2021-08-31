import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lobster is the enemy of the crab
 * 
 * @author (Sam Frack) 
 * @version (8/31/2021)
 */
public class Lobster extends Actor
{
    //This method repeats the following information
    public void act()
    {
        move(3);
        turnAtEdge();
    }

    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
}


    