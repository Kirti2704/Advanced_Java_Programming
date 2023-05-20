import java.awt.*;
import java.awt.event.*;

public class awtwindow extends Frame {
    private TextField tf1, tf2;
    private Button btn;

    public awtwindow() {
        setLayout(new FlowLayout());

        tf1 = new TextField("Enter text here", 20);
        add(tf1);

        tf2 = new TextField(20);
        add(tf2);

        btn = new Button("Enter");
        add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Copy text from tf1 to tf2
                tf2.setText(tf1.getText());
            }
        });

        setTitle("Text Field Demo");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new awtwindow();
    }
}