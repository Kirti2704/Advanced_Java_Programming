import java.awt.*;

public class qthree {
    public static void main(String[] args){
        Frame f1 = new Frame();
        f1.setSize(400,500);
        Label l1 = new Label("Enter your Name:");
        l1 .setBounds(30,100,100,30);

        TextField t1 = new TextField();
        t1.setBounds(150,110,150,20);

        f1.add(l1);
        f1.add(t1);

        f1.setLayout(null);
        f1.setVisible(true);
    }
}
