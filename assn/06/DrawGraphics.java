import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * DrawGraphics handles the creation and movement of graphical objects
 */
public class DrawGraphics {
    // Single ArrayList of Movers
    private ArrayList<Mover> movers;
    
    /**
     * Initialize the graphics
     */
    public DrawGraphics() {
        // Create ArrayList for all movers
        movers = new ArrayList<Mover>();
        
        // Create and add bouncing Rectangle
        Rectangle boxBounce = new Rectangle(50, 50, 100, 50, Color.BLUE);
        Bouncer boxBouncer = new Bouncer(boxBounce, 600, 600);
        boxBouncer.setMovementVector(2, 1);
        movers.add(boxBouncer);
        
        // Create and add bouncing Circle
        Circle circleBounce = new Circle(200, 200, 80, Color.RED);
        Bouncer circleBouncer = new Bouncer(circleBounce, 600, 600);
        circleBouncer.setMovementVector(-1, 3);
        movers.add(circleBouncer);
        
        // Create and add straight-moving Rectangle
        Rectangle boxStraight = new Rectangle(300, 300, 60, 40, Color.GREEN);
        StraightMover boxMover = new StraightMover(boxStraight);
        boxMover.setMovementVector(1, 2);
        movers.add(boxMover);
        
        // Create and add straight-moving Circle
        Circle circleStraight = new Circle(400, 100, 60, Color.YELLOW);
        StraightMover circleMover = new StraightMover(circleStraight);
        circleMover.setMovementVector(-2, 1);
        movers.add(circleMover);
    }
    
    /**
     * Draw the contents of the window on surface
     */
    public void draw(Graphics surface) {
        // Draw all movers in the ArrayList
        for (Mover m : movers) {
            m.draw(surface);
        }
    }
}