package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Array KI LENGTH!!!");
        int length = obj.nextInt();
	    int arr[] = new int[length];
	    boolean flag = true;

	   for(int i = 0 ; i<arr.length;i++){
	       arr[i] = obj.nextInt();
       }
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter serch value !!!");

        int key = obj.nextInt();

        for(int i = 0 ; i<arr.length;i++){
           if(arr[i] == key){
               System.out.println("Yes present !!!"+(i+1)+" Array value : "+arr[i]);
               flag = false;
               break;
           }
        }

        if(flag){
            System.out.println("Not found");
        }
    }
}
