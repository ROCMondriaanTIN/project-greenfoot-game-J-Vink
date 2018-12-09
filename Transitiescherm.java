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
        GoudenMunt gMunt1 = new GoudenMunt(810, 1035, 1);
        Collectable.goudenMunten.add(gMunt1);
        ZilverenMunt zMunt1 = new ZilverenMunt(900, 2054, 1);
        Collectable.zilverenMunten.add(zMunt1);
        
    }
}
