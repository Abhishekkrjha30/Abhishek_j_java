import java.util.Scanner;

public class starsqSingleloop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=1;
        for (int i=1;i<=n;){
            if(b<=n){
                System.out.printf("*");
                b++;
            }
            else{
                i++;
                b=1;
                System.out.println();

            }
        }
    }
}
