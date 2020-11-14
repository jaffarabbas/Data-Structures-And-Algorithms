package com.DSA;

import java.util.Arrays;

public class quick_sort {
    static int partition(int[] arr,int low,int high){
        int pivoit,i,j,temp;
        pivoit=arr[high];
        i=low-1;
        boolean flag=false;
        for ( j = low; j < high; j++) {
            if(arr[j] < pivoit){
                i++;
                System.out.println("i: "+i+" j: "+j);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                flag=true;
                System.out.println(Arrays.toString(arr)+" swap : "+flag);
                flag =false;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        flag = true;
        System.out.println("swap ("+arr[i+1]+","+arr[high]+" )"+" swap : "+flag);
        return i+1;
    }
    static void sort(int[] arr,int low,int high){
        if(low < high){
            int parttion = partition(arr,low,high);
            sort(arr,low,parttion-1);
            sort(arr,parttion+1,high);
        }
    }
    static void test(){
        int[] arr={5,4,3,2,1};
        int size = arr.length-1;
        System.out.println("Unsorted!!");
        System.out.println(Arrays.toString(arr));
        sort(arr,0,size);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        quick_sort.test();
    }
}
