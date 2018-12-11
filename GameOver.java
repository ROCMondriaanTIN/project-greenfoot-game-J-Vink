import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    static GreenfootSound gameOver = new GreenfootSound("GameOver.mp3");
    
    
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("Game Over.png");
        gameOver.playLoop();
        addObject(new Knop(90, true), 800, 400);
    }
}
