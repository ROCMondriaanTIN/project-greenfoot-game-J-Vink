import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Collectable
{
    public boolean opgepakt;

    public Diamant() {
        super();
        setImage("Diamond" + Greenfoot.getRandomNumber(3) + ".png");
        Collectable.colNr++;
    }

    @Override
    public void act() {
        applyVelocity();
        
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.diamanten++;
                this.opgepakt = true;
                getWorld().removeObject(this);
                break;
            }
        }
    }
}
