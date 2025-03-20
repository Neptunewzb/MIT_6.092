/**
 * Sprite interface for drawable objects
 * Provides methods for drawing and determining object dimensions
 */
public interface Sprite {
    /**
     * Draws this sprite on the surface
     */
    public void draw(java.awt.Graphics surface);
    
    /**
     * Returns the width of this sprite
     */
    public int getWidth();
    
    /**
     * Returns the height of this sprite
     */
    public int getHeight();
    
    /**
     * Returns the x position of this sprite
     */
    public int getX();
    
    /**
     * Returns the y position of this sprite
     */
    public int getY();
}