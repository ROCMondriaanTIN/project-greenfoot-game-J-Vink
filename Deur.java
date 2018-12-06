import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deur extends Mover
{
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
            if ((hero != null) && (Hero.hasKey == true)) {
                setImage("door_openMid.png");
                if(Greenfoot.isKeyDown("down")){
                    Greenfoot.setWorld(new Transitiescherm());
                }
            }
        }
    }    
}
