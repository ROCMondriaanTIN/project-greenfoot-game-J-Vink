
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deur extends Mover
{
    GreenfootSound unlock = new GreenfootSound("Door.mp3");
    GreenfootSound completed = new GreenfootSound("Level completed.mp3");
    boolean firstUnlock = true;
    public Deur(){
        setImage("door_closedMid.png");
    }
    public Deur(int i){
        setImage("door_openMid.png");
    }
    public void act() 
    {
        applyVelocity();
        for (Hero hero : getIntersectingObjects(Hero.class)) {
            if ((hero != null) && (Hero.hasKey == true) || (Hero.sleutels >= Hero.wereld)) {
                setImage("door_openMid.png");
                if(firstUnlock)unlock.play();
                firstUnlock = false;
                if(Greenfoot.isKeyDown("down")){
                    completed.play();
                    cleanup();
                    if(Hero.sleutels < Hero.wereld){
                        hero.sleutels++;
                    }
                    if(Hero.wereld == 4) Greenfoot.setWorld(new Uitgespeeld());
                    else Greenfoot.setWorld(new Transitiescherm());
                    Hero.background.stop();
                    Collectable.sleutels.remove(0);
                }
            }
        }
    }    
    void cleanup(){
        getWorld().removeObjects(getWorld().getObjects(Tile.class));
        getWorld().removeObjects(getWorld().getObjects(Wolk.class));
        getWorld().removeObjects(getWorld().getObjects(Camera.class));
        getWorld().removeObjects(getWorld().getObjects(Hud.class));
        getWorld().removeObjects(getWorld().getObjects(Hero.class));
        
    }
}
