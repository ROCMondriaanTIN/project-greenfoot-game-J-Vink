import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoudenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoudenMunt extends Collectable
{
    public boolean opgepakt;
    public GoudenMunt() {
        super();
        setImage("coinGold.png");
        Collectable.colNr++;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten+=2;
                getWorld().removeObject(this);
                this.opgepakt = true;
                break;
            }
        }
    }   
}
