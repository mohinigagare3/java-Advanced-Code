import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample {
    JFrame F;
    JPanel P;
    JButton btnDemo;

    public MouseListenerExample() {
        F = new JFrame();
        P = new JPanel();
        btnDemo = new JButton("Demo-Button");

        F.setSize(300, 200);
        F.setLocation(100, 100);

        F.setTitle("MouseListener");
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added proper exit operation
        F.add(P);
        P.setLayout(null);

        btnDemo.setBounds(100, 100, 150, 30);
        P.add(btnDemo);

        btnDemo.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e1) {
                System.out.println("Mouse is Clicked");
            }

            public void mouseExited(MouseEvent e2) {
                System.out.println("Mouse is Exited");
            }

            public void mouseEntered(MouseEvent e3) {
                System.out.println("Mouse is Entered");
            }

            public void mousePressed(MouseEvent e4) {
                System.out.println("Mouse is Pressed");
            }

            public void mouseReleased(MouseEvent e5) {
                System.out.println("Mouse is Released");
            }
        });
    }

    public static void main(String args[]) {
        new MouseListenerExample();
    }
}