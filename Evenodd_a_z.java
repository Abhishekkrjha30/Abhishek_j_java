import java.util.Scanner;

public class Evenodd_a_z {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        for (;a<=b;a++){
            if(a%2==0){
                System.out.printf("%d Even number.\n",a);
            }
            else {
                System.out.printf("%d Odd number.\n",a);

            }
        }
    }
}
