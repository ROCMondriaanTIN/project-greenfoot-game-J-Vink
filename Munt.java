import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Munt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Munt extends Hud
{
    char type;
    /**
     * Act - do whatever the Munt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
    }
    public Munt(char type){
        if(type == 'g'){
            setImage("coinGold.png");
            this.type = type;
        }
        else{
            setImage("coinSilver.png");
            this.type = type;
        }
    }
}
