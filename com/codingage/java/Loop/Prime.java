package com.codingage.java.Loop;

import java.util.*;
public class Prime {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int c=0;
        for(int i=2;i<a;i++){
            if(a%i==0) {
                c = 1;
            }
        }
          if(c==0){
              System.out.println(" prime");
          }
          else{
              System.out.println("not prime");
          }
    }
}

