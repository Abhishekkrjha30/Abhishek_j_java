import java.util.Scanner;

public class Armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;          int rem,s=0;
        for(int i=n;i!=0;i=i/10){
            count=count+1;
        }
        for (int i=n;i!=0;i=i/10){
            int sum=1;
            rem=i%10;
            for (int j=1;j<=count;j++){
                sum=sum*rem;
            }
            s=s+sum;
        }
        if(n==s){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
