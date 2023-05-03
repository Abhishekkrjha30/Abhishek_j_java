import java.util.Scanner;

public class MaxMinavg {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number check?");
        int a=sc.nextInt();
        int n;    int sum=0;   int max=-999999;    int min=999999;
        System.out.println("Enter number:");

        for(int i=1;i<=a;i++){
            n=sc.nextInt();
            sum=sum+n;
            if(max<n){
                max=n;
            }
            if (min>n){
                min=n;
            }
        }
        System.out.printf("Average=%d\n",sum/a);
        System.out.printf("max number=%d\n",max);
        System.out.printf("min number=%d\n",min);
    }
}
