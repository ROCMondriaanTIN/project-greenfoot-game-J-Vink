import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transitiescherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transitiescherm extends World
{
    /**
     * Constructor for objects of class Transitiescherm.
     * 
     */
    public Transitiescherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
        addObject(new Window(8, 300, 405), 300,550);
        addObject(new Window(8, 300, 405), 700,550);
        addObject(new StartTransitie(), 500, 150);
        addObject(new KarakterTransitie(1), 230, 460);
        addObject(new KarakterTransitie(2), 365, 545);
        addObject(new KarakterTransitie(3), 250, 650);
        addObject(new LevelNummer(1), 700, 435);
        addObject(new LevelNummer(2), 700, 515);
        addObject(new LevelNummer(3), 700, 595);
        addObject(new LevelNummer(4), 700, 675);
        resetMunten();
        voegMuntenToe();
        Hero.hasKey = false;
        LevelNummer.levelSelected = false;
        KarakterTransitie.karakterSelected = false;
        Hud.firstStart = true;
        Hud.update = false;
    }
    
    void resetMunten(){
        Collectable.goudenMunten.clear();
        Collectable.zilverenMunten.clear();
    }
    
    void voegMuntenToe(){
        //Level 1:
        new GoudenMunt(810, 1035, 1);
        new ZilverenMunt(1710, 1095, 1);
        new ZilverenMunt(900, 2000, 1);
        new ZilverenMunt(5555, 1635, 1);
        new ZilverenMunt(3580, 250, 4);
        
        //Level 2:
        new GoudenMunt(4955, 640, 2);
        new ZilverenMunt(3480, 435, 2);
        new ZilverenMunt(1525, 545, 2);
        
        //Level 3:
        new GoudenMunt(3995, 200, 3);
        new ZilverenMunt(7235, 1275, 3);
        
        //Level 4:
        new GoudenMunt(935, 375, 4);
        new ZilverenMunt(395, 75, 4);
        new ZilverenMunt(5400, 680, 4);
        new ZilverenMunt(2125, 615, 4);
        
    }
}
