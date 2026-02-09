import java.awt.*;

public class DrawShapes extends Canvas {
    public static void main(String args[]) {
        Frame F = new Frame();
        F.setSize(500, 500);
        F.setLocation(100, 100);
        F.setTitle("Shapes");
        F.add(new DrawShapes());
        F.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.RED);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.drawLine(100, 100, 300, 300);
        g.drawLine(300, 100, 100, 300);
    }
}