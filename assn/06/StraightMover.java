import java.awt.Graphics;

/**
 * StraightMover class that moves objects in a straight line, without bouncing
 * Implements the Mover interface
 */
public class StraightMover implements Mover {
    private Sprite sprite;
    private int xDirection;
    private int yDirection;
    
    /**
     * Create a StraightMover with the given sprite
     */
    public StraightMover(Sprite sprite) {
        this.sprite = sprite;
        
        // Default direction
        xDirection = 1;
        yDirection = 1;
    }
    
    /**
     * Set the movement vector to control direction and speed
     */
    @Override
    public void setMovementVector(int xDirection, int yDirection) {
        this.xDirection = xDirection;
        this.yDirection = yDirection;
    }
    
    /**
     * Draw the sprite and update its position
     */
    @Override
    public void draw(Graphics graphics) {
        // Draw the sprite
        sprite.draw(graphics);
        
        // Update the position
        int x = sprite.getX() + xDirection;
        int y = sprite.getY() + yDirection;
        
        // Update sprite position - using type checking to ensure the sprite has setX/setY methods
        if (sprite instanceof Rectangle) {
            ((Rectangle)sprite).setX(x);
            ((Rectangle)sprite).setY(y);
        } else if (sprite instanceof Circle) {
            ((Circle)sprite).setX(x);
            ((Circle)sprite).setY(y);
        }
    }
}