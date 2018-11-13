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
    public byte karakter = 1;
    public String wereld = "Wereld_1";

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p" + karakter+ ".png");
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
                Greenfoot.setWorld(new wereld);
                break;
            }
        }
    }
    
    boolean opGrond(){
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return onder != null;
    }
    
    public void handleInput() {
        if ((Greenfoot.isKeyDown("space")) && (opGrond() == true)) {
            velocityY = -30;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
