import javax.swing.*;
import java.awt.*;

public class InterfaceWindow {
    public static void main(String[] args) {
        window();
    }

    public static void window() {
        JLabel label = new JLabel("This is a plugin for Nojus Net.", JLabel.CENTER);
        label.setAlignmentX(0);
        label.setAlignmentY(0);

        JFrame frame = new JFrame("Nojus Net");
        frame.setResizable(false);
        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setFocusableWindowState(true);
        frame.add(label);
    }
}
