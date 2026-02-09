import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Practical7 {
    JFrame F;
    JPanel P;
    JButton btnNew, btnClose;

    public Practical7() {
        F = new JFrame(); // Added missing semicolon
        P = new JPanel();

        btnNew = new JButton("New");
        btnClose = new JButton("Close All");

        F.setSize(400, 500);
        F.setLocation(100, 100);
        F.setTitle("MultiCasting"); // Set title for frame
        F.setVisible(true);

        P.setLayout(null);
        F.add(P);

        btnNew.setBounds(20, 20, 100, 30);
        P.add(btnNew);

        btnClose.setBounds(130, 20, 100, 30);
        P.add(btnClose);

        btnNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                JFrame F = new JFrame();
                F.setSize(400, 500);
                F.setLocation(110, 110);
                F.setTitle("DemoFrame");
                F.show();
            }
        });

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new Practical7();
    }
}