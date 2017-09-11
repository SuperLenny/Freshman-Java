import greenfoot.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Animal. This is the base class for all animals. In addition to the standard Actor
 * methods, it provides the ability to move and turn.
 * 
 * @author Michael Kolling
 * @version 1.0
 * @author Mihaela Sabin
 * @version Sep 10, 2010
 *    - renamed original method 'eat' to 'remove' to eliminate confusion with the 
 *    Cat's method 'eat'. 
 *    - used in 'friendly-cat' scenarios as parent for Cat and MeanAnimal.
 */
public class Animal extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    
    /**
     * Constructor for Animal - nothing to do.
     */
    public Animal()
    {
    }

    /**
     * Act - empty method. Animals have no default action.
     */
    public void act()
    {
    }
    
    
    /**
     * Turn 'angle' degrees towards the right (clockwise).
     */
    public void turn(int angle)
    {
        super.setRotation(super.getRotation() + angle);
    }
    

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        double angle = Math.toRadians( super.getRotation() );
        int x = (int) Math.round(super.getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(super.getY() + Math.sin(angle) * WALKING_SPEED);
        
        super.setLocation(x, y);
    }

    
    /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean atWorldEdge()
    {
        if(super.getX() < 20 || super.getX() > super.getWorld().getWidth() - 20)
            return true;
        if(super.getY() < 20 || super.getY() > super.getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = super.getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    
    /**
     * Remov an object of class 'clss'. This is only successful if there
     * is such an object where this animal instance is. Otherwise the method does
     * nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = super.getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            super.getWorld().removeObject(actor);
        }
    }
    public void walkLeft()
    {
        walk( -10, "cat-walk-left.png", "cat-walk-left2.png");
    }
    
    public void walkRight()
    {
        walk( 10, "cat-walk-right.png", "cat-walk-right2.png");
    }
    
    public void jumpUp()
    {
        this.jump( -10, "small-cat-fly.png", "small-cat-fly-2.png");
    }
    
    public void jumpDown()
    {
        this.jump( 10, "small-cat-fall.png", "small-cat-fall-2.png");
    }
    
    private void walk( int dx, String img1, String img2)
    {
            setImage(img1);
            Greenfoot.delay(4);
            setLocation(getX( ) + dx, getY());
            setImage(img2);
            Greenfoot.delay(4);
            setLocation(getX() + dx, getY());        
    }

    private void jump( int dy, String img1, String img2)
    {
            setImage(img1);
            Greenfoot.delay(4);
            setLocation(getX( ), getY( ) + dy);
            setImage(img2);
            Greenfoot.delay(4);
            setLocation(getX( ), getY( ) + dy);
    }
}
