import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knop extends Actor
{
    boolean click;
    int i;
    public Knop(int i, boolean click){
        if(i <10){
            setImage("Button_0" + i + ".png");
        }
        else setImage("Button_" + i + ".png");
        this.i = i;
        this.click = click;
    }
    public void act() 
    {
        if (click) click();
    }    
    void click(){
        if((this.i == 66) && (Greenfoot.mouseClicked(this))) Greenfoot.setWorld(new Transitiescherm());
        else if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Startscherm());
            GameOver.gameOver.stop();
        }
    }
}
