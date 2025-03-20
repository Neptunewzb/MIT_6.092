import java.awt.Graphics;

/**
 * Bouncer class that handles moving objects by bouncing them off edges
 * Implements the Mover interface
 */
public class Bouncer implements Mover {
    private Sprite sprite;
    private int xDirection;
    private int yDirection;
    private int width;
    private int height;
    
    /**
     * Create a Bouncer with the given sprite and window dimensions
     */
    public Bouncer(Sprite sprite, int width, int height) {
        this.sprite = sprite;
        this.width = width;
        this.height = height;
        
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
        
        // Check if we hit the edges of the window and reverse direction if needed
        if (x < 0) {
            x = 0;
            xDirection = -xDirection;
        } else if (x + sprite.getWidth() > width) {
            x = width - sprite.getWidth();
            xDirection = -xDirection;
        }
        
        if (y < 0) {
            y = 0;
            yDirection = -yDirection;
        } else if (y + sprite.getHeight() > height) {
            y = height - sprite.getHeight();
            yDirection = -yDirection;
        }
        
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