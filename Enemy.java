
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private boolean dropsCoin;
    public static GreenfootSound splat = new GreenfootSound("Splat.wav");

    public Enemy(int walkRange, boolean dropsCoin) {
        super();
        setImage("snailWalk1.png");
        getImage().mirrorHorizontally();
        this.walkRange = walkRange;
        firstAct = true;
        speed = 1;
        this.dropsCoin = dropsCoin;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        
        if (getOneObjectAtOffset(0, -45, Hero.class) != null) 
        {      
           if(this.dropsCoin) getWorld().addObject(new ZilverenMunt(), getX(), getY());
           getWorld().removeObject(this);
           splat.play();
        }     
        else if(getOneObjectAtOffset(-19, 10, Hero.class) != null || getOneObjectAtOffset(19, 10, Hero.class) != null )
        {  
            Hero.gaatAf();
        }
    }
}
