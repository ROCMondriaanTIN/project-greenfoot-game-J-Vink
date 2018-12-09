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
                Collectable.keys.play();
                Hero.hasKey = true;
                switch(Hero.wereld){
                    case 1:
                    Hud.key.setImage("hud_key1.png");
                    break;
                    case 2:
                    Hud.key.setImage("hud_key2.png");
                    break;
                    case 3:
                    Hud.key.setImage("hud_key3");
                    break;
                    case 4:
                    Hud.key.setImage("hud_key0");
                    break;
                }
            }
        }
    }    
}
