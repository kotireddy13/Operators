import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int a = sc.nextInt();
        System.out.println("Enter num : ");
        int b = sc.nextInt();
        System.out.println("Arthimetic Operators");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println("Relational Operators");
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println("Logical Operations");
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);
        System.out.println(!(a>b));
        
    }
}
