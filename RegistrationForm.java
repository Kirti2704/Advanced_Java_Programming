import java.awt.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {
    private JLabel nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton submitButton, cancelButton;
    
    public RegistrationForm() {
        super("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        
        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(20);

        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.add(confirmPasswordLabel);
        inputPanel.add(confirmPasswordField);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        setLayout(new BorderLayout());
        
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        setSize(400, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
