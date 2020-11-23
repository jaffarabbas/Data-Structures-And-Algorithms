package com.company;


import java.util.Arrays;
import java.util.Scanner;

class BinarySerch{
    void array_sorting(int arr[],int length){
        int i,j,min,temp;

        for (i=0;i<length-1;i++){
            min = i;
            for(j=i+1;j<length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
    int binaryserch(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Array length : ");
        int length = scn.nextInt();
        int[] arr = new int[length];
        for(int i = 0;i<arr.length;i++){
            System.out.print("Array index "+(i+1)+" : ");
            arr[i] = scn.nextInt();
        }
        array_sorting(arr,arr.length);
        System.out.print("[");
        for (int i:arr){
            System.out.print(i+",");
        }
        System.out.print("]");

        System.out.print("\n\nEnter Value in the Binary Search Engine : ");


        //binary search

        int low,mid,high,value;

        value = scn.nextInt();
        low = 0;
        high = arr.length-1;

        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid] == value){
                return mid;
            }
            if(arr[mid] < value){//arr 5 = 1 2 3 4 5  ,value = 4, mid = 2 : array index 2 value = 3,value = 4 mid = 2 , ar[mid] = 3 , 3 < 4 ,low = mid + 1 , low = 3  , hig = 5 value at mid is value hense in 3 index is 4
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}


public class pr_set1_Binary_Search {
    public static void main(String[] args) {
        BinarySerch object_1 = new BinarySerch();
        System.out.println(object_1.binaryserch());
    }
}
