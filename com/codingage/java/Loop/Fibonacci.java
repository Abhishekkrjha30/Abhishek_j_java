package com.codingage.java.Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0; int a=1;  int b=1;
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("com.codingage.java.Loop.Fibonacci Series:");
        System.out.printf("%d,%d",sum,a);
        for(int i=3;i<=n;i++){
            sum=sum+a;
            a=b;
            b=sum;
            System.out.printf(",%d",sum);
        }
    }
}
