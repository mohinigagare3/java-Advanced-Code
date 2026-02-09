import java.awt.*;
import javax.swing.*;

public class HumanFace extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw face
        g.setColor(Color.green);
        g.drawOval(40, 40, 120, 150);
        
        // Eyes
        g.setColor(Color.black);
        g.drawOval(57, 75, 30, 20);
        g.setColor(Color.blue);
        g.drawOval(110, 75, 30, 20);
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);
        
        // Nose
        g.drawOval(85, 100, 30, 30);
        
        // Mouth
        g.setColor(Color.cyan);
        g.fillArc(60, 125, 80, 40, 180, 180);
        
        // Ears
        g.setColor(Color.cyan);
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFace panel = new HumanFace();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}