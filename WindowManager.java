import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowManager {

    public static void main(String[] args) {
        // 1. Create the main window
        JFrame mainWindow = new JFrame("Om");
        mainWindow.setSize(400, 300);
        
        // Stops the program when the main window closes
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainWindow.setLocationRelativeTo(null); // Centers on screen

        // 2. Add a button to open the separate window
        JButton openButton = new JButton("Menu");
        JPanel panel = new JPanel();
        panel.add(openButton);
        mainWindow.add(panel);

        // 3. Define what happens when the button is clicked
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createSeparateWindow();
            }
        });

        // 4. Show the main window
        mainWindow.setVisible(true);
    }

    // Method to build and display the secondary window
    private static void createSeparateWindow() {
        JFrame secondWindow = new JFrame("Separate Window");
        secondWindow.setSize(300, 200);
        
        // CRITICAL: Destroys only this window, leaving the main app running
        secondWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        secondWindow.setLocationRelativeTo(null);

        // Add some content to the second window
        JPanel panel = new JPanel();
        panel.add(new JLabel("This is a completely independent window!"));
        secondWindow.add(panel);

        // Show the second window
        secondWindow.setVisible(true);
    }
}
