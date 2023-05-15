package com.codingage.java.operators;

import java.util.Scanner;

public class Marks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char a=sc.nextLine().charAt(0);
        char b=sc.nextLine().charAt(0);
        char c=sc.nextLine().charAt(0);
        int i= sc.nextInt();
        int j= sc.nextInt();
        int k= sc.nextInt();
        System.out.printf("%c=%d\n",a,i);
        System.out.printf("%c=%d\n",b,j);
        System.out.printf("%c=%d\n\n",c,k);
        int x=i>j&&i>k?i:(j>i&&j>k?j:k);
        System.out.printf("first is:%d\n",x);

    }
}
