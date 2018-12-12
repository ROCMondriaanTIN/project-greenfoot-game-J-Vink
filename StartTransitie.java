import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartTransitie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartTransitie extends Actor
{
    public static int level;
    /**
     * Act - do whatever the StartTransitie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public StartTransitie(){
        setImage("start.png");
        getImage().scale(320, 300);
    }
    public void act() 
    {
        click();
    }
    
    private void click(){
        if((Greenfoot.mouseClicked(this))&&(LevelNummer.levelSelected == true)&&(KarakterTransitie.karakterSelected == true)){
            switch(level){
                case 1:
                Greenfoot.setWorld(new Wereld_1());
                break;
                case 2:
                Greenfoot.setWorld(new Wereld_2());
                break;
                case 3:
                Greenfoot.setWorld(new Wereld_3());
                break;
                case 4:
                Greenfoot.setWorld(new Wereld_4());
                break;
            }
        }
    }
}
