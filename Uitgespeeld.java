import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uitgespeeld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uitgespeeld extends World
{
    //GreenfootSound victory = new GreenfootSound("Victory.mp3");
    
    
    public Uitgespeeld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg_blender.jpg");
        addObject(new Treasure(), 500, 400);
        addObject(new Knop(66, true), 900, 500);
        addObject(new Knop(18, true), 900, 700);
        addObject(new EindTekst(), 500, 100);
        //victory.playLoop();
    }
}
