import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uitleg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uitleg extends Actor
{
    static boolean extend;
    public Uitleg(){
        setImage("Button_08.png");
        getImage().scale(360, 135);
    }
    private void click(){
        if(extend == true) extend();
        if(Greenfoot.mouseClicked(this)){
            Startscherm.uitleg = true;
            this.setLocation(500, 250);
            setImage("Window_12.png");
            getImage().scale(617, 472);
        }
    }
    public void extend(){
            Startscherm.uitleg = true;
            this.setLocation(500, 250);
            setImage("Window_12.png");
            getImage().scale(617, 472);
            extend = false;
    }
    public void act(){
        click();
    }
}
