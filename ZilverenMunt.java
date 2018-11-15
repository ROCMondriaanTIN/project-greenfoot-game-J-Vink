import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZilverenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZilverenMunt extends Collectable
{
    public ZilverenMunt() {
        super();
        setImage("coinSilver.png");
        Collectable.colNr++;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten++;
                getWorld().removeObject(this);
                break;
            }
        }
    }
}
