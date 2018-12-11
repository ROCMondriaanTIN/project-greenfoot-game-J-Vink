import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (Jeffrey Vink) 
 * @version (a version number or a date)
 */
public class Startscherm extends World{
        public static int hudLevens;
        public static int hudMunten;
        public static boolean uitleg;
    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    Uitleg uitlegObj = new Uitleg();
    static GreenfootSound intro = new GreenfootSound("Intro.mp3");
    public Startscherm()
    {    
        // Create a new world with 1000*800 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg_blender.jpg");
        Start start = new Start();
        addObject(start, 500, 600);
        addObject(uitlegObj, 500, 250);
        reset();
        voegObjectenToe();
        uitleg = false;
        intro.playLoop();
    }
    
    public static void reset(){
        Hero.levens = 2;
        Hero.wereld = 0;
        Hero.sleutels = 0;
        hudLevens = 0;
        hudMunten = 0;
        Hero.munten = 0;
        Hero.muntWaarde = 0;
        Hero.diamanten = 0;
        Hud.reset();
    }
    
    void voegObjectenToe(){
        Collectable.diamanten.add(new Diamant(1, 300, 2050));
        Collectable.sleutels.add(new Sleutel(1, 1, 5720, 1700));
        Collectable.sleutels.add(new Sleutel(2, 2, 385, 554));
        Collectable.sleutels.add(new Sleutel(3, 3, 415, 554));
        Collectable.sleutels.add(new Sleutel(0, 4, 3685, 2054));
    }
    
    
}
