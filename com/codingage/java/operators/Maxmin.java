package com.codingage.java.operators;

import java.util.Scanner;

public class Maxmin {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a>b?a:b;
        int d=a<b?a:b;
        System.out.println("max="+c);
        System.out.println("min="+d);
    }
}
