import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window extends Actor
{
    public Window(int i, int x, int y){
        setImage("Window_0" + i + ".png");
        getImage().scale(x, y);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
