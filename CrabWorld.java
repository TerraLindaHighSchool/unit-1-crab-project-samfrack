import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,262,228);
        Worm worm = new Worm();
        addObject(worm,360,430);
        Worm worm2 = new Worm();
        addObject(worm2,385,80);
        Worm worm3 = new Worm();
        addObject(worm3,136,78);
        Worm worm4 = new Worm();
        addObject(worm4,111,375);
        Worm worm5 = new Worm();
        addObject(worm5,259,127);
        Worm worm6 = new Worm();
        addObject(worm6,493,284);
        Worm worm7 = new Worm();
        addObject(worm7,88,224);
        Worm worm8 = new Worm();
        addObject(worm8,215,484);
        Lobster lobster = new Lobster();
        addObject(lobster,411,469);
    }
}