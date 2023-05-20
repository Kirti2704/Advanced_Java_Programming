import java.awt.*;
import java.awt.event.*;

public class Stringlength extends Frame implements ActionListener {
    private Label label;
    private TextField textField;
    private Button button;

    public Stringlength() {
        setLayout(new FlowLayout());
        label = new Label("Enter a string:");
        add(label);
        textField = new TextField(20);
        add(textField);
        button = new Button("OK");
        add(button);
        button.addActionListener(this);
        setTitle("String Length");
        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String input = textField.getText();
        int length = input.length();
        String message = "The length of the string you entered is: " + length;
        Dialog dialog = new Dialog(this, "String Length", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(okButton);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Stringlength();
    }
}
