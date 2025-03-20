import java.awt.Color;
import java.awt.Graphics;

/**
 * Rectangle class that implements Sprite
 * Represents a simple rectangle that can be drawn on the screen
 */
public class Rectangle implements Sprite {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    
    /**
     * Create a rectangle with the specified properties
     */
    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    /**
     * Draw the rectangle on the surface
     */
    public void draw(Graphics surface) {
        surface.setColor(color);
        surface.fillRect(x, y, width, height);
    }
    
    /**
     * Get the width of the rectangle
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Get the height of the rectangle
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Get the x position of the rectangle
     */
    public int getX() {
        return x;
    }
    
    /**
     * Get the y position of the rectangle
     */
    public int getY() {
        return y;
    }
    
    /**
     * Set the x position of the rectangle
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Set the y position of the rectangle
     */
    public void setY(int y) {
        this.y = y;
    }
}