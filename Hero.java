import greenfoot.*;

public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    protected static int karakter;
    public static int wereld = 1;
    public static int sleutels;
    protected static int munten;
    protected static int muntWaarde;
    protected static int diamanten;
    public static int levens;
    public static boolean hasKey;
    //Afbeeldingen voor loopanimatie.
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;

    public Hero() {
        super();
        gravity = 19.8;
        acc = 0.9;
        drag = 0.8;
        setImage("p" + karakter + ".png");
        hasKey = false;
        
        for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p" + karakter + "_walk" + (i+1) + ".png" );
        setImage( images[imageNumber] );
        
        
    }
    
    public static void gaatAf(){
        levens--;
        hasKey = false;
         switch(wereld){
              case 1:
              Greenfoot.setWorld(new Wereld_1());
              break;
              case 2:
              Greenfoot.setWorld(new Wereld_2());
              break;
              case 3:
              Greenfoot.setWorld(new Wereld_3());
              break;
              case 4:
              Greenfoot.setWorld(new Wereld_4());
              break; 
        }
    }
    
    public boolean isVanScherm(){
        if(getX() < 0)  
            return true;  
        if(getY() < 0)  
            return true;  
        else 
            return false; 
    }
    
    void opWater(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Water.class);
        if(onder != null){
            gaatAf();
        }
    }
    void opLava(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Lava.class);
        if(onder != null){
            gaatAf();
        }
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        // Kijk of de speler zich op het water bevind of van het scherm is.
        opWater();
        if (isVanScherm()){
          gaatAf();
        }
        
        for (Vuurbal enemy : getIntersectingObjects(Vuurbal.class)) {
            if (enemy != null) {
               gaatAf();
            }
        }
        
        // Check of de speler nog levens over heeft.
        if(levens < 1){
            Greenfoot.setWorld(new GameOver());
        }
        for (Actor rope : getIntersectingObjects(Rope.class)) {
            if ((rope != null) && (Greenfoot.isKeyDown("space"))) {
                velocityY = -15;
                break;
            }
            /*else if((rope != null) && (Greenfoot.isKeyDown("down"))){
                velocityY = 15
            }*/
        }
        for (Actor rope : getIntersectingObjects(Bridge.class)) {
            if((rope != null) && (Greenfoot.isKeyDown("down"))){
                velocityY = 15;
            }
        }
    }
    
    boolean opGrond(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        Tile tile = (Tile) onder;
        if(tile != null) {
            if(tile.isSolid){
                setImage( images[5] );
                return true;
            }
        }
        setImage( images[3] );
        return false;
    }
    
    public void animation(){
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
    }
        
    
    public void handleInput() {
        if ((Greenfoot.isKeyDown("space")) && (opGrond() == true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            if(opGrond() == true){
                animation();
            }
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
            if(opGrond() == true){
                animation();
            }
            velocityX = 10;
        }
    }

    public int getWidth() {
        return 17;
    }

    public int getHeight() {
        return 17;
    }
}
