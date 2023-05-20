import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyConsoleDemo {
    public MyConsoleDemo() {
    }

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            Rectangle screenRect = device.getDefaultConfiguration().getBounds();
            BufferedImage image = robot.createScreenCapture(screenRect);
            JLabel label = new JLabel(new ImageIcon(image));
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(3);
            frame.getContentPane().add(label);
            frame.setUndecorated(true);
            device.setFullScreenWindow(frame);
        } catch (AWTException var7) {
            System.err.println(var7);
        }

    }
}