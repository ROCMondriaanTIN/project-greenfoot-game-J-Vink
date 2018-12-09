import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start(){
        setImage("Button_14.png");
    }
    boolean hover;
    public void act() 
    {
        click();
        if (!hover && Greenfoot.mouseMoved(this)){  
            setImage("Button_15.png");  
            hover = true;  
        }  
        if (hover && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this)){  
             setImage("Button_14.png");  
             hover = false;  
        }
    }
    
    private void click(){
        if(Greenfoot.mouseClicked(this)&&Startscherm.uitleg==true){
            setImage("Button_16.png");
            Greenfoot.setWorld(new Transitiescherm());
        }
        else if(Greenfoot.mouseClicked(this)&&Startscherm.uitleg==false){
            Uitleg.extend = true;
        }
    }
}
