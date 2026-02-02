import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method to ensure proper painting
        g.setColor(Color.red);
        g.fillOval(50, 40, 80, 80);
        g.setXORMode(Color.green);
        g.fillOval(100, 40, 80, 80);
        g.setPaintMode(); // Reset to normal paint mode
        g.setColor(Color.black);
        g.fillRect(45, 120, 150, 20);
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500, 600);
        setTitle("Paint Mode");
        MyPanel p = new MyPanel();
        getContentPane().add(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Properly close the application
    }
}

public class Practical3 {
    public static void main(String args[]) {
        MyFrame F = new MyFrame();
        F.setVisible(true); // Use setVisible(true) instead of show()
    }
}