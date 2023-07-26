package com.DSA;

import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("SUM OF AN Array !!!!!");
        int[] arr = {1,2,3,4,5,99,6,7,8,9,34,34,56,78,34,232,55};
        for(int num:arr){
            System.out.println("Array : "+num);
        }
        int sum=0;
        for(int i = 0 ; i< arr.length ; i++){
            sum += arr[i];
        }
        System.out.println("SUM OF AN ARRAY IS : "+sum);
    }
}
