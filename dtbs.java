package AJLab5;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class dtbs extends Frame implements ActionListener {
    private TextField nameField, regnoField, roomnoField;
    private Button addButton, updateButton, deleteButton;
    private Label messageLabel;
    private Connection connection;

    public dtbs() {
        super("Database Demo");

        // Create text fields
        nameField = new TextField(20);
        regnoField = new TextField(20);
        roomnoField = new TextField(20);

        // Create buttons
        addButton = new Button("Add");
        addButton.addActionListener(this);
        updateButton = new Button("Update");
        updateButton.addActionListener(this);
        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);

        // Create message label
        messageLabel = new Label("");

        // Add components to window
        setLayout(new GridLayout(4, 2));
        add(new Label("SName:"));
        add(nameField);
        add(new Label("RegNo:"));
        add(regnoField);
        add(new Label("Roomno:"));
        add(roomnoField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(messageLabel);

        // Connect to MySQL database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");
        } catch (Exception ex) {
            messageLabel.setText("Error connecting to database: " + ex.getMessage());
        }

        // Set window size and visibility
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Statement statement = connection.createStatement();
            String name = nameField.getText();
            int id = Integer.parseInt(regnoField.getText());
            int room = Integer.parseInt(roomnoField.getText());

            if (e.getSource() == addButton) {
                statement.executeUpdate("INSERT INTO mytable (name, age, id) VALUES ('" + name  + "', " + id + ", " + room + ")");
                messageLabel.setText("Record added successfully");
            } else if (e.getSource() == updateButton) {
                statement.executeUpdate("UPDATE mytable SET name = '" + name + "', age = " + id + " WHERE id = " + room);
                messageLabel.setText("Record updated successfully");
            } else if (e.getSource() == deleteButton) {
                statement.executeUpdate("DELETE FROM mytable WHERE id = " + id);
                messageLabel.setText("Record deleted successfully");
            }
        } catch (Exception ex) {
            messageLabel.setText("Error performing operation: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new dtbs();
    }
}
