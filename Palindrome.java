import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=n;    int rem,rev=0;
        for(;a!=0;a=a/10){
            rem=a%10;
            rev=rev*10+rem;
        }
        if(rev==n){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("Not palindrome number");

        }
    }
}
