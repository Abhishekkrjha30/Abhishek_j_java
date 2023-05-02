import java.util.Scanner;

public class Evensum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=0;
        for(;a<=b;a++){
            if (a%2==0) {
                sum = sum + a;
            }
        }
        System.out.println("Even sum="+sum);
    }
}
