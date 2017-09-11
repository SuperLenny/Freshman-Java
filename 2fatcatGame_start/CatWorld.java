import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatWorld  extends World
{

    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public CatWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(700, 500, 1); 
        //add a cat on position
        addObject(new Cat(), 200,450);
    }
    
   /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        // 2 % of the time add a pizza at a random location
         if (Greenfoot.getRandomNumber(100) < 2) 
        {      
            addObject(new Pizza(), Greenfoot.getRandomNumber(700), 0);
        }
        if (Greenfoot.getRandomNumber(200) < 1) 
        {      
            addObject(new Apple(), Greenfoot.getRandomNumber(700), 0);
        }
    }
}
