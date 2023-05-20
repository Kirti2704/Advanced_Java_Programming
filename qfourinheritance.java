import java.awt.Frame;
import java.awt.*;

public class qfourinheritance extends Frame {
    public qfourinheritance(){
        setSize(500,500);
        Label l1 = new Label("Choose Your Favorite Language:");
        l1.setBounds(100,150,200,30);
        Choice ch = new Choice();
        ch.setBounds(100,200,50,30);
        ch.add("Java");
        ch.add("Python");
        ch.add("C#");
        ch.add("C/C++");
        
        add(l1);
        add(ch);
        
        setLayout(null);
        setVisible(true);      
    }
    public static void main(String[] args) {
        qfourinheritance obj = new qfourinheritance();
    }
}