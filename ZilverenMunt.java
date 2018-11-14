import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZilverenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZilverenMunt extends Collectable
{
    /**
     * Act - do whatever the ZilverenMunt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor collectable : getIntersectingObjects(Hero.class)) {
            if (collectable != null) {
                getWorld().removeObject(this);
                Hero.munten++;
                break;
            }
        }
    }    
    
    public ZilverenMunt(){
        setImage("coinSilver.png");
    }
}
