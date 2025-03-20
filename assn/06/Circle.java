import java.awt.Color;
import java.awt.Graphics;

/**
 * Circle class that implements Sprite
 * Represents a simple circle that can be drawn on the screen
 */
public class Circle implements Sprite {
    private int x;
    private int y;
    private int diameter;
    private Color color;
    
    /**
     * Create a circle with the specified properties
     */
    public Circle(int x, int y, int diameter, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
    }
    
    /**
     * Draw the circle on the surface
     */
    public void draw(Graphics surface) {
        surface.setColor(color);
        surface.fillOval(x, y, diameter, diameter);
    }
    
    /**
     * Get the width of the circle (diameter)
     */
    public int getWidth() {
        return diameter;
    }
    
    /**
     * Get the height of the circle (diameter)
     */
    public int getHeight() {
        return diameter;
    }
    
    /**
     * Get the x position of the circle
     */
    public int getX() {
        return x;
    }
    
    /**
     * Get the y position of the circle
     */
    public int getY() {
        return y;
    }
    
    /**
     * Set the x position of the circle
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Set the y position of the circle
     */
    public void setY(int y) {
        this.y = y;
    }
}