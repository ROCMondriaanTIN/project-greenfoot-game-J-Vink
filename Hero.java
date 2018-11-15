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
    public String wereld = "Wereld_1";
    protected static int munten;
    protected static int levens = 2;

    public Hero() {
        super();
        gravity = 19.8;
        acc = 0.9;
        drag = 0.8;
        setImage("p" + karakter + ".png");
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

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                levens--;
                Greenfoot.setWorld(new Wereld_1());
                break;
            }
        }
         
        // Check of de speler nog levens over heeft.
        if(levens < 0){
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    boolean opGrond(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return onder != null;
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
