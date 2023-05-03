import java.util.Scanner;

public class StarspaceSingleloop{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=1; int s=n;
        for (int i=1;i<=n;){
            if(s>i){
                System.out.printf(" ");
                s--;
            }
           else if(b<=i){
                System.out.printf("*");
                b++;
            }
            else{
                i++;
                b=1;
                System.out.println();
                s=n;
            }
        }
    }
}



