package com.DSA;

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("OCCURANCE OF AN KEY IN Array !!!!!");
        int[] arr = {1,2,2,2,5,99,6,7,8,9,34,34,56,78,34,232,55};
        for(int num:arr){
            System.out.println("Array : "+num);
        }
        //ocurance code
        System.out.println("Enter key");
        int key = scn.nextInt();
        int count = 0;
        boolean flag = false;
        for(int i = 0 ; i< arr.length;i++){
            if(key == arr[i]){
                count++;
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Number is not Found");
        }else{
            System.out.println("OCCURANCE OF "+key+" COMES THIS TIMES : "+count);
        }
    }
}
