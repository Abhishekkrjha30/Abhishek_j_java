import java.util.Scanner;

public class Starspacetr {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                for (int k=n;k>=i;k--){
                    System.out.printf(" ");
                }
                for (int j=1;j<=i;j++){
                    System.out.printf(" *");
                }
                System.out.println();
            }
        }
    }

