package com.dsacracker;


import java.util.Scanner;

class reversearray{
    Scanner scn = new Scanner(System.in);
    public void reversearray(){
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

        System.out.println("Reverse of array : ");

        int min = 0;
        int high = arr.length - 1;
        int temp;

        while(min < high){
            temp = arr[min];
            arr[min] = arr[high];
            arr[high] = temp;
            min++;
            high--;
        }

        for (int num:arr) {
            System.out.print(" "+num);
        }
    }

    public reversearray(){
        reversearray();
    }
}


public class q1_reverse_Array {
    public static void main(String[] args) {
        reversearray object = new reversearray();
    }
}
