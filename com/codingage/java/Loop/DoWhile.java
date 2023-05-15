package com.codingage.java.Loop;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            n=sc.nextInt();
           System.out.println(n);
        }
        while (n!=0);
    }
}
