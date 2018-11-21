import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Write a description of class GoudenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoudenMunt extends Collectable
{
    public int muntX;
    public int muntY;
    protected int wereld;
    public int id;
    public static int sID;
    public GoudenMunt(){
        super();
        setImage("coinGold.png");
        this.id = sID;
        sID++;
    }
    public GoudenMunt(int x, int y, int wereld) {
        super();
        setImage("coinGold.png");
        Collectable.colNr++;
        this.muntX = x;
        this.muntY = y;
        this.wereld = wereld;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten+=2;
                getWorld().removeObject(this);
                Collectable.goudenMunt.remove(id);
                break;
            }
        }
    }   
}
