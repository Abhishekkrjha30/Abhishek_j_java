package com.codingage.java.Loop;

import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        System.out.println("Enter only 0 or 1:");
        int zcount=0,ocount=0;
        for (int i=1;i<=n;i++){
            int a=sc.nextInt();
            if (a==0){
                zcount=zcount+1;
            }
            else if (a==1) {
                ocount=ocount+1;
            }
            else {
                System.out.println("invalid number Enter only 0 or 1:");
                i--;
            }
        }
        System.out.println("0="+zcount);
        System.out.println("1="+ocount);

    }
}
