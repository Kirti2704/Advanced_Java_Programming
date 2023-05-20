import java.awt.*;
import java.awt.event.*;

public class lab6 extends Frame implements Runnable, TextListener {
    private Thread thread;
    private TextArea textArea;
    private Label label;
    private int charCount;

    public lab6() {
        setTitle("Character Counting");
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Initialize components
        textArea = new TextArea();
        textArea.addTextListener(this);
        label = new Label("Character count: 0");

        // Add components to frame
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        // Start thread
        thread = new Thread(this);
        thread.start();

        // Show frame
        setVisible(true);
    }

    public void run() {
        while (true) {
            try {
                // Sleep for 100ms
                Thread.sleep(100);

                // Update label
                label.setText("Character count: " + charCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void textValueChanged(TextEvent e) {
        // Update character count
        charCount = textArea.getText().length();
    }

    public static void main(String[] args) {
        new lab6();
    }
}