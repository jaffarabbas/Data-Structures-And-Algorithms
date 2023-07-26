package com.dsacracker;


import java.util.Scanner;

class min_max_array{
    Scanner scn = new Scanner(System.in);
    public void array_view(){
        System.out.println("Reverse Array !!!!!");
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
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("MIN : "+min);
    }

    public min_max_array(){
        array_view();
    }
}


public class q2_minmaxarray {
    public static void main(String[] args) {
        min_max_array object = new min_max_array();
    }
}
