import java.awt.*;
public class qoneinheritance extends Frame {
    public qoneinheritance(){
        Label l1 = new Label("Hello VIT");
        l1.setBounds(100,120,50,20);
        setSize(500,500);
        add(l1);

        setLayout(null);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        qoneinheritance q1 = new qoneinheritance();
    } 
}
