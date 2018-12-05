import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelNummer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelNummer extends Actor
{
    public int level;
    public static boolean levelSelected;
    /**
     * Act - do whatever the LevelNummer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LevelNummer(int nummer){
        setImage("hud_" + nummer + ".png");
        this.level = nummer;
    }
    public void act() 
    {
        click();
    }
    
    private void click(){
        if(Greenfoot.mouseClicked(this)){
            levelSelected = true;
            StartTransitie.level = this.level;
        }
    }
}
