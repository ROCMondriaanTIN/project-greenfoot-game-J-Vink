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
    public int id;
    public static int sID;
    public GoudenMunt(){
        super();
        setImage("coinGold.png");
        this.id = sID;
        sID++;
    }
    public GoudenMunt(int x, int y) {
        super();
        setImage("coinGold.png");
        Collectable.colNr++;
        this.muntX = x;
        this.muntY = y;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten+=2;
                getWorld().removeObject(this);
                // Swwitch-case waarin hij het uit een specifieke wereld haalt.
                 switch(Hero.wereld){
                     case 1:
                     Collectable.goudenMuntWereld1.remove(id);
                     break;
                     case 2:
                     Collectable.goudenMuntWereld2.remove(id);
                     break;
                     /*case 3:
                     Collectable.goudenMuntWereld3.remove(id);
                     break;
                     case 4:
                     Collectable.goudenMuntWereld4.remove(id);
                     break; */
                    }
                break;
            }
        }
    }   
}
