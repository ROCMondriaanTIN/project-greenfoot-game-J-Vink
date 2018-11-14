import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KarakterTransitie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KarakterTransitie extends Actor
{
    private int karakter;
    /**
     * Act - do whatever the KarakterTransitie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            Hero.karakter = this.karakter;
            Greenfoot.setWorld(new Wereld_1());
        }
    }
    
    public KarakterTransitie(int i) {
        setImage("p" + i + ".png");
        karakter = i;
    }
}
