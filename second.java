import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int subt=a-b;
        in.close();
        System.out.println("Sum of numbers is: "+ a+b);
        System.out.println("Difference of numbers i: " + subt);
        System.out.println("Multipication of numbers is: "+ a*b);
        System.out.println("Divison of numbers is: "+ a/b);
        System.out.println("Remainder of numbers is: "+ a%b);
    }
}
