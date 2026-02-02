import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawer extends JFrame implements ActionListener {
    
    private String shapeToDraw = ""; // Store the selected shape

    public ShapeDrawer() {
        setTitle("Geometric Shape Drawer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        String[] shapes = {"Line", "Rectangle", "Circle"};
        for (String shape : shapes) {
            JButton button = new JButton(shape);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Clears previous drawings

        // Draw selected shape
        g.setColor(Color.BLUE);
        switch (shapeToDraw) {
            case "Line":
                g.drawLine(50, 100, 400, 100);
                break;
            case "Rectangle":
                g.drawRect(100, 150, 300, 150);
                break;
            case "Circle":
                g.drawOval(150, 150, 200, 200);
                break;
            default:
                // Nothing selected
                break;
        }
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        shapeToDraw = e.getActionCommand(); // Set shape from button text
        repaint(); // Refresh the frame to draw the new shape
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}
