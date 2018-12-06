import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Hud
{
    public Key(){
        switch(Hero.wereld){
            case 1:
                setImage("hud_key1_disabled.png");
            break;
            case 2:
                setImage("hud_key2_disabled.png");
            break;
            case 3:
                setImage("hud_key3_disabled.png");
            break;
            case 4:
                setImage("hud_key0_disabled.png");
            break;
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
