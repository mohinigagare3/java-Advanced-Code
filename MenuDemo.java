import javax.swing.*;
import java.awt.event.*;

public class MenuDemo {
    JFrame F;
    JMenuBar mb;
    JMenu mnuFile, mnuEdit;
    JMenuItem mnuiNew, mnuiOpen, mnuiSave;
    JMenuItem mnuiCut, mnuiCopy, mnuiPaste;

    public MenuDemo() {
        F = new JFrame("Menu Demo");
        F.setSize(400, 400);
        F.setLocation(100, 100);
        F.setVisible(true);
        F.setLayout(null);

        mb = new JMenuBar();
        F.setJMenuBar(mb);

        mnuFile = new JMenu("File");
        mnuEdit = new JMenu("Edit");

        mnuiNew = new JMenuItem("New");
        mnuiOpen = new JMenuItem("Open");
        mnuiSave = new JMenuItem("Save");

        mnuiCut = new JMenuItem("Cut");
        mnuiCopy = new JMenuItem("Copy");
        mnuiPaste = new JMenuItem("Paste");

        mb.add(mnuFile);
        mb.add(mnuEdit);

        mnuFile.add(mnuiNew);
        mnuFile.add(mnuiOpen);
        mnuFile.add(mnuiSave);
        mnuEdit.add(mnuiCut);
        mnuEdit.add(mnuiCopy);
        mnuEdit.add(mnuiPaste);

        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new MenuDemo();
}
}