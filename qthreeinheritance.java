import java.awt.*;
public class qthreeinheritance extends Frame {
    public qthreeinheritance() {
        setSize(400,500);
        Label l1 = new Label("Enter your Name:");
        l1 .setBounds(30,100,100,30);

        TextField tx = new TextField();
        tx.setBounds(150,110,150,20);

        add(l1);
        add(tx);

        setLayout(null);
        setVisible(true);
    }  
    public static void main(String[] args) {
        qthreeinheritance obj = new qthreeinheritance();
    }
}