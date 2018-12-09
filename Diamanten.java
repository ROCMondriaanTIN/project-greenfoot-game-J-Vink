import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamanten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamanten extends Hud
{
    public static boolean update;
    public Diamanten(){
        setImage(new GreenfootImage("X " + Hero.diamanten, 30, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    void updateDiamanten(){
        setImage(new GreenfootImage("X " + Hero.diamanten, 30, Color.WHITE, new Color(0, 0, 0, 0)));
        update = false;
    }
    
    public void act(){
        if(update) updateDiamanten();
    }
}
