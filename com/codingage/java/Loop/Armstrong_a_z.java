package com.codingage.java.Loop;

import java.util.Scanner;

public class Armstrong_a_z {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number.");
        int a=sc.nextInt();
        System.out.println("Enter last number.");
        int b=sc.nextInt();
        while(a<=b){
            int count=0,rem=0,s=0;
            for (int k=a;k!=0;k=k/10){
                count=count+1;
            }
            for (int i=a;i!=0;i=i/10){
                rem=i%10;
                int sum=1;
                for (int j=1;j<=count;j++){
                    sum=sum*rem;
                }
                s=s+sum;
            }
            if (s==a) {
                System.out.println(a + "is Armstrong number.");
            }
            a++;
        }
    }
}
