
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vuurbal extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Vuurbal() {
        super();
        setImage("fireball.png");
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
        turn(17);
        applyVelocity();
        
        if(getOneObjectAtOffset(0, 0, Hero.class) != null)
        {  
            Hero.gaatAf();
        }
    }
}
