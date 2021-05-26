import java.awt.*; import javax.swing.*;
import org.violetlib.aqua.fc.*;

public class App {
  
  // NSRequiresAquaSystemAppearance = NO;
  
  private static void createWindow() {

    // try {
    //   UIManager.setLookAndFeel(darculaLookAndFeel);
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }
    if (System.getProperty("os.name", "").startsWith("Mac OS")) {
      try {
        UIManager.setLookAndFeel("org.violetlib.aqua.AquaLookAndFeel");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    JFrame frame = new JFrame("Apex answers");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
    textLabel.setPreferredSize(new Dimension(300, 100));
    frame.getContentPane().add(textLabel, BorderLayout.CENTER);

    // frame.setBackground(Color.black);
    // SwingUtilities.updateComponentTreeUI(frame);
    
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    createWindow();
  }
}
