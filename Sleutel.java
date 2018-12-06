import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
public class Sleutel extends Collectable
{
    public int wereld;
    public int x;
    public int y;
    public Sleutel(int i, int wereld, int x, int y){
        setImage("key" + i + ".png");
        this.wereld = wereld;
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        applyVelocity();
        for (Hero hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                getWorld().removeObject(this);
                Hero.hasKey = true;
            }
        }
    }    
}
