import java.util.Scanner;

public class Table {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum;
        System.out.printf("Table of %d.\n",n);
        for (int i=1;i<=10;i++){
            sum=i*n;
            System.out.printf("%d*%d=%d\n",i,n,sum);
        }
    }
}
