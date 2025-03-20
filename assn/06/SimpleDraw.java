import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SimpleDraw provides a simple drawing surface for other classes to use
 */
public class SimpleDraw extends JPanel implements Runnable {
    private static final long serialVersionUID = 1L;
    private Thread animator;
    private DrawGraphics draw;
    
    /**
     * Initializes the panel and sets it up for drawing
     */
    public SimpleDraw() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.WHITE);
        
        // Create a DrawGraphics object to handle the actual drawing
        draw = new DrawGraphics();
        
        // Start the animation thread
        animator = new Thread(this);
        animator.start();
    }
    
    /**
     * Draw the contents of the panel
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        draw.draw(g2);
    }
    
    /**
     * Run the animation loop
     */
    public void run() {
        while (true) {
            // Refresh the display
            repaint();
            
            // Delay to get 20 frames per second
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // Nothing to do here
            }
        }
    }
    
    /**
     * Main method to create and show the drawing panel
     */
    public static void main(String[] args) {
        final SimpleDraw panel = new SimpleDraw();
        
        JFrame frame = new JFrame("Simple Draw");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}