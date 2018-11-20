import greenfoot.*;
/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private boolean jumping;
    protected static int karakter;
    public static int wereld = 1;
    protected static int munten;
    protected static int diamanten;
    public static int levens;
    public static int sleutels;

    public Hero() {
        super();
        gravity = 19.8;
        acc = 0.9;
        drag = 0.8;
        setImage("p" + karakter + ".png");
    }
    
    public static void gaatAf(){
        levens--;
         switch(wereld){
              case 1:
              Greenfoot.setWorld(new Wereld_1());
              break;
              case 2:
              Greenfoot.setWorld(new Wereld_2());
              break;
              /* case 3:
               * Greenfoot.setWorld(new Wereld_3());
               * break;
               * case 4:
               * Greenfoot.setWorld(new Wereld_4());
               * break; 
               */
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
        
        if (isVanScherm())
        {
          gaatAf();
        }
        
        for (Vuurbal enemy : getIntersectingObjects(Vuurbal.class)) {
            if (enemy != null) {
               levens--;
                switch(wereld){
                    case 1:
                    Greenfoot.setWorld(new Wereld_1());
                    break;
                    case 2:
                    Greenfoot.setWorld(new Wereld_2());
                    break;
                    /*case 3:
                    Greenfoot.setWorld(new Wereld_3());
                    break;
                    case 4:
                    Greenfoot.setWorld(new Wereld_4());
                    break;*/ 
               }
            }
        }
        
        opWater();
         
        // Check of de speler nog levens over heeft.
        if(levens < 1){
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    boolean opGrond(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        //boolean test = onder.getIsSolid();
        Tile tile = (Tile) onder;
        if(tile != null) {
            if(tile.isSolid){
                return true;
            }
        }
        return false;
    }
        
    
    public void handleInput() {
        if ((Greenfoot.isKeyDown("space")) && (opGrond() == true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
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
