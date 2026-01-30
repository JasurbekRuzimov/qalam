package string_problems;
import javax.swing.*;
import java.awt.*;

public class ImagePanelExample extends JFrame {

    public ImagePanelExample() {
        setTitle("Image Panel Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Create an ImageIcon from your image file
        // Ensure the image file (e.g., "my_image.png") is in the project's root directory or specify the full path.
        ImageIcon icon = new ImageIcon("src/string_problems/akrom.png");

        // 2. Create a JLabel and set the icon
        JLabel label = new JLabel(icon);

        // 3. Create a JPanel and add the JLabel to it
        JPanel panel = new JPanel();
        panel.add(label);

        // 4. Add the panel to the JFrame
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(ImagePanelExample::new);
    }
}

