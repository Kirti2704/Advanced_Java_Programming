import java.util.*;
public class third{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        in.close();
        System.out.println("Perimeter is = " + 2*Math.PI*r);
        System.out.println("Area is = " + Math.PI*r*r);
    }
}