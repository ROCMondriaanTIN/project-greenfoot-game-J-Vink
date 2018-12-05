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
    public static boolean karakterSelected;
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
            karakterSelected = true;
        }
    }
    
    public KarakterTransitie(int i) {
        setImage("p" + i + ".png");
        karakter = i;
    }
}
