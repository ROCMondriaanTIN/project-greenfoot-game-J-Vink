import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Actor
{
    public Treasure(){
        setImage("treasure.png");
        if(Hero.diamanten == 0) getImage().scale(98, 92);
        else getImage().scale(480+(48*Hero.diamanten), 468+(46*Hero.diamanten));
    }
}
