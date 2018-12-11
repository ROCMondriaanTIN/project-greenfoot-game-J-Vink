import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deurtop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deurtop extends Mover
{
    public Deurtop(){
        setImage("door_closedTop.png");
    }
    public Deurtop(int i){
        setImage("door_closedTop.png");
    }
    public void act() 
    {
        applyVelocity();
        for (Hero hero : getIntersectingObjects(Hero.class)) {
            if ((hero != null) && (Hero.hasKey == true) || (Hero.sleutels >= Hero.wereld)) {
                setImage("door_openTop.png");
            }
        }
    }    
}
