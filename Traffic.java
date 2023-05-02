import java.util.Scanner;

public class Traffic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char signal=sc.nextLine().charAt(0);
        switch (signal){
            case 'r':
            case 'R':
                System.out.println("Stop");
                break;
            case 'y':
            case 'Y':
                System.out.println("Ready");
                break;
            case 'g':
            case 'G':
                System.out.println("go");
                break;
            default:
                    System.out.println("pls Enter valid number");


        }
    }
}
