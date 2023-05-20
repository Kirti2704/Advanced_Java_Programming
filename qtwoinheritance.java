import java.awt.*;

public class qtwoinheritance extends Frame {
    public qtwoinheritance(){
        TextField t1 = new TextField();
        t1.setBounds(30,50,50,20);
        TextField t2 = new TextField();
        t2.setBounds(30,70,50,20);
        Button b1 = new Button("Click Me");
        b1.setBounds(30,100,50,30);

        add(t1);
        add(t2);
        add(b1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        qtwoinheritance obj = new qtwoinheritance();
    }
}
