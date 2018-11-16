import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Hud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud extends Actor
{
    public void update(){
        // HUD interface.
        // Heart
        if(Hero.levens > Startscherm.hudLevens){
            for(int i = 0; i < Hero.levens; i++){
                getWorld().addObject(new Heart(),(50+(60*i)), 50);
                Startscherm.hudLevens++;
            }
        }
        // Munten
        if(Hero.munten > Startscherm.hudMunten){
            for(int i = 0; Startscherm.hudMunten < Hero.munten; i++){
                getWorld().addObject(new Munt(),(950-(10*Startscherm.hudMunten)), 50);
                Startscherm.hudMunten++;
            }
        }
        // Reset munten in HUD wanneer er 40 muntjes zijn verzameld.
        if(Hero.munten >= 40){
            Hero.munten = (Hero.munten-40);
            Startscherm.hudMunten = 0;
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Hero.levens++;
        }
        
        //Diamanten
        //addObject(new Diamanten(), 50, 110);
    }
    
    public static void reset(){
        Startscherm.hudLevens = 0;
        Startscherm.hudMunten = 0;
    }
    public void act() 
    {
        update();
    }  

}
