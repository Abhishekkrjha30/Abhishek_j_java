package com.codingage.java.Loop;

import java.util.Scanner;

public class Oddmulti {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=1;
        while(a<=b){
            if (a%2!=0){
                sum=sum*a;
            }
            a=a+1;
        }
        System.out.println("Multiply odds="+sum);
    }
}
