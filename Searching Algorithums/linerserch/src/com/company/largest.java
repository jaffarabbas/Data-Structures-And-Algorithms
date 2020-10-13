package com.company;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Array KI LENGTH!!!");
        int length = obj.nextInt();
        int arr[] = new int[length];
//        boolean flag = true;
         int max =0;

        for(int i = 0 ; i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("\n"+max);

    }
}
