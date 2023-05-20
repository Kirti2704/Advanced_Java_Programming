import java.awt.*;
import java.awt.event.*;

public class SquareCalculator extends Frame implements ActionListener {

    Label enterLabel;
    TextField inputField;
    Button calculateButton;

    public SquareCalculator() {
        super("Square Calculator");

        enterLabel = new Label("Enter a number:");
        inputField = new TextField(10);
        calculateButton = new Button("Calculate");

        calculateButton.addActionListener(this);

        setLayout(new FlowLayout());

        add(enterLabel);
        add(inputField);
        add(calculateButton);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputString = inputField.getText();
        int inputNumber = Integer.parseInt(inputString);
        int squaredNumber = inputNumber * inputNumber;

        String message = "The square of the number you entered is: " + squaredNumber;

        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(300, 200);            
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}