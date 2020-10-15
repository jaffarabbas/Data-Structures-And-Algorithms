package com.DSA;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("MAX MIN Array !!!!!");
        int[] arr = {1,2,3,4,5,99,6,7,8,9,34,34,56,78,34,232,55};
        for(int num:arr){
            System.out.println("Array : "+num);
        }
        System.out.println("MAX VALUE : ");
        int max = arr[0];
        for(int i =1 ; i< arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("MAX : "+max);
        System.out.println("MIN VALUE : ");
        int min = arr[0];
        for(int i =1 ; i< arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("MIN : "+min);
    }
}
