import java.awt.Graphics;

/**
 * Mover interface for objects that can move sprites
 */
public interface Mover {
    /**
     * Draw the sprite and update its position
     */
    public void draw(Graphics graphics);
    
    /**
     * Set the movement vector to control direction and speed
     */
    public void setMovementVector(int xDirection, int yDirection);
}