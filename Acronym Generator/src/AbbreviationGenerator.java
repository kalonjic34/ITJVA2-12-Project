import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbbreviationGenerator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Abbreviation Generator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
