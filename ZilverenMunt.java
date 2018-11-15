import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZilverenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZilverenMunt extends Collectable
{

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public ZilverenMunt() {
        super();
        setImage("coinSilver.png");
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
                Hero.munten++;
                getWorld().removeObject(this);
                break;
            }
        }
    }
}
