import javax.swing.*;
import java.awt.*;

public class AppletParamDemo extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);
        String s = getParameter("aa");
        if (s == null)
            s = "java";
        g.drawString("hello " + s, 10, 10);
    }
}