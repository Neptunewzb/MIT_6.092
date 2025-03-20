import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Create an ArrayList to store multiple BouncingBox instances
    private ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // Initialize the ArrayList
        boxes = new ArrayList<BouncingBox>();
        
        // Create first box - red, moving right and down
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(1, 1); // Move right and down
        boxes.add(box1);
        
        // Create second box - blue, moving left and up
        BouncingBox box2 = new BouncingBox(100, 200, Color.BLUE);
        box2.setMovementVector(-1, -1); // Move left and up
        boxes.add(box2);
        
        // Create third box - green, moving right and up
        BouncingBox box3 = new BouncingBox(300, 150, Color.GREEN);
        box3.setMovementVector(2, -1); // Move right and up faster
        boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        // Draw a line as in the original code
        surface.drawLine(50, 50, 250, 250);
        
        // Draw all boxes in the ArrayList using a loop
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}