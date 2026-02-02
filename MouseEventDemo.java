import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    Label label;
    int x, y; // Coordinates for mouse drag

    public MouseEventDemo() {
        // Frame setup
        setTitle("Mouse Events Demo");
        setSize(500, 400);
        setLayout(new FlowLayout());

        // Label to display mouse actions
        label = new Label("Perform mouse actions inside the window");
        add(label);

        // Add mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Window");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        label.setText("Mouse Dragged at (" + x + ", " + y + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        label.setText("Mouse Moved at (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
