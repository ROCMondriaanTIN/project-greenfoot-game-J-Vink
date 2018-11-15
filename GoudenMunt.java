import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoudenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoudenMunt extends Collectable
{

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public GoudenMunt() {
        super();
        setImage("coinGold.png");
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
        applyVelocity();
        if (getX() >= xMax) {
            x = xMax;
        } else if (getX() <= xMin) {
            x = xMin;
        }
        
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten+=2;
                getWorld().removeObject(this);
                break;
            }
        }
    }   
}
