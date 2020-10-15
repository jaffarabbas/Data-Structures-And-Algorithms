package com.DSA;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Linear Search in Array !!!!!");
        int[] arr = {1,2,3,4,5,99,6,7,8,9,34,34,56,78,34,232,55};
        for(int num:arr){
            System.out.println("Array : "+num);
        }
        System.out.println("Enter search value !!!");
        int key = scn.nextInt();
        boolean flag = true;
        for(int i = 0 ; i<arr.length;i++){
           if(arr[i] == key){
               System.out.println("Yes present At "+(i)+" Array value : "+arr[i]);
               flag = false;
               break;
           }
        }
        if(flag){
            System.out.println("Not found");
        }
    }
}
