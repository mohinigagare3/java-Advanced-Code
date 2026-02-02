import java.awt.*;
import javax.swing.*;

public class PaintModeDemo extends JPanel {
    public PaintModeDemo() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the paint mode to XOR
        g.setXORMode(Color.red);

        // Draw a rectangle
        g.fillRect(50, 50, 100, 100);

        // Draw another rectangle
        g.fillRect(100, 100, 100, 100);

        // Reset the paint mode to normal
        g.setPaintMode();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint Mode Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new PaintModeDemo());
        frame.setVisible(true);
    }
}


