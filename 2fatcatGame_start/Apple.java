import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
   private GreenfootImage apple1 = new GreenfootImage("apple1.png"); //set image of apple
        
        private int speed; //set the speed of each leaf

    /**
     * This is a constrctor for pizza.
     */
    public Apple()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
        speed = (Greenfoot.getRandomNumber(2)+1);
     }

    /**
     * Act - do whatever the Leaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        falling();
        checkForMiss();

    }   
    
       /**
    * falling - simulate the pizza falling to the ground.  Slowly rotate, change
    * course just a little horizontally each time through
    */
    public void falling()
    {
        int newX = Greenfoot.getRandomNumber(7) - 3; //gives me a # between -5 & 5
        setLocation(getX() + newX, getY()+speed);
        setRotation(getRotation() - 1); // have leaf slowly rotate

    }
    
    
     /**
     * checkForMiss - if the leaf hits the ground, it means the Catcher
     * did not catch the leaf. Remove the leaf object and do whatever you want 
     */
    public void checkForMiss()
    {
        if (getY()> getWorld().getHeight() - 25) {
            getWorld().removeObject(this);
        }
    }
       
}