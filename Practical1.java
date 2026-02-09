import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass's paintComponent method
        int j = 0;
        String s[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        g.setColor(Color.black);
        for (int i = 0; i < s.length; i++) {
            Font f = new Font(s[i], Font.PLAIN, 18);
            g.setFont(f);
            g.drawString("Hello", 10, j + 20); // Adjusted y-coordinate to avoid overlap
            j = j + 20;
        }
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 500);
        setTitle("Font Demo");
        MyPanel P = new MyPanel();
        getContentPane().add(P);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Practical1 {
    public static void main(String args[]) {
        MyFrame F = new MyFrame();
        F.setVisible(true); // Use setVisible(true) instead of show()
    }
}