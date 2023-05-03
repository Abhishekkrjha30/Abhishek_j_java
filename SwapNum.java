import java.util.*;
public class SwapNum {
    public static void main(String[] args) {
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a=ab.nextInt();
        int b=ab.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("After Swap:");

        int t=a;a=b;b=t;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
