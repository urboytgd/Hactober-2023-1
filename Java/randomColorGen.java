import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomColorGenerator {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Random Color Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Create a button
        JButton button = new JButton("Press me for a random color!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate a random color
                Random random = new Random();
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);
                Color randomColor = new Color(red, green, blue);

                // Set the background color of the frame
                frame.getContentPane().setBackground(randomColor);
            }
        });
        
        // Center the button in the frame
        frame.setLayout(new GridBagLayout());
        frame.add(button);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
