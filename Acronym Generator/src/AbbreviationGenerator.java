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

    private static void placeComponents(JPanel panel) {
        // Set the layout manager to null for absolute positioning
        panel.setLayout(null);

        JLabel firstWordLabel = new JLabel("First Word");
        firstWordLabel.setBounds(10, 20, 80, 25);
        panel.add(firstWordLabel);

        JTextField firstWordText = new JTextField(20);
        firstWordText.setBounds(100, 20, 165, 25);
        panel.add(firstWordText);

        JLabel secondWordLabel = new JLabel("Second Word");
        secondWordLabel.setBounds(10, 50, 80, 25);
        panel.add(secondWordLabel);

        JTextField secondWordText = new JTextField(20);
        secondWordText.setBounds(100, 50, 165, 25);
        panel.add(secondWordText);

        JLabel thirdWordLabel = new JLabel("Third Word");
        thirdWordLabel.setBounds(10, 80, 80, 25);
        panel.add(thirdWordLabel);

        JTextField thirdWordText = new JTextField(20);
        thirdWordText.setBounds(100, 80, 165, 25);
        panel.add(thirdWordText);

        JButton generateButton = new JButton("Generate Abbreviation");
        generateButton.setBounds(10, 110, 180, 25);
        panel.add(generateButton);

        JLabel abbreviationLabel = new JLabel("Abbreviation: ");
        abbreviationLabel.setBounds(10, 140, 300, 25);
        panel.add(abbreviationLabel);
    }
}
