import javax.swing.*;

public class Practical9 {
    JFrame F;
    JPanel P;
    JLabel lblItem;
    JComboBox cmbItem;
    JList lstItem;
    String[] item = {"Pen", "Pencil", "Book", "NoteBook"};

    public Practical9() {
        F = new JFrame();
        P = new JPanel();
        lblItem = new JLabel("Select the Items :");
        cmbItem = new JComboBox();
        lstItem = new JList(item); // Initialize JList with the item array

        F.setSize(330, 300);
        F.setLocation(100, 100);
        F.setTitle("GUI Demo");
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Add proper exit operation

        P.setLayout(null);
        F.add(P);

        lblItem.setBounds(20, 20, 150, 30);
        P.add(lblItem);

        cmbItem.setBounds(20, 60, 100, 30);
        P.add(cmbItem);

        lstItem.setBounds(170, 60, 100, 150);
        P.add(lstItem);

        // Populate combo box with items
        cmbItem.addItem("Pen");
        cmbItem.addItem("Pencil");
        cmbItem.addItem("Book");
        cmbItem.addItem("NoteBook");
    }

    public static void main(String args[]) {
        new Practical9();
    }
}