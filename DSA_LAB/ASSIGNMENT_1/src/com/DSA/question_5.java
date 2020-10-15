package com.DSA;

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Lenght !!!");
        int length = scn.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print("Array value at "+i+" index is : ");
            arr[i] = scn.nextInt();
        }
        for (int num:arr) {
            System.out.println("Array = "+num);
        }
        System.out.println("Enter serch value !!!");
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
