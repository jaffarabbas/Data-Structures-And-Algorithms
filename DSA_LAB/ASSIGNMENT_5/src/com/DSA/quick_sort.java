//package com.DSA;

import java.util.Arrays;

public class quick_sort {
    static int partition(int[] arr,int low,int high){
        int pivoit,i,j,temp,count=0;
        pivoit=arr[high];
        i=low-1;
        boolean flag=false;
        for ( j = low; j < high; j++) {
            if(arr[j] < pivoit){
                i++;
                System.out.println("i: "+i+" j: "+j+" arr[i] : ["+arr[i]+"]  arr[j] : ["+arr[j]+"] pivot : ["+arr[high]+"] arr["+arr[j]+"] < arr["+arr[high]+"] swap("+arr[i]+" , "+arr[j]+") \n");
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                flag=true;
                System.out.println(Arrays.toString(arr)+" swap : "+flag+"\n");
                flag =false;
            }else{
                flag =false;
                System.out.println("i: "+i+" j: "+j+" value : "+arr[j]+" pivot : ["+arr[high]+"]  -> swap : "+flag+"\n");
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        flag = true;
        System.out.println("swap ("+arr[i+1]+","+arr[high]+" ) swap : "+flag+"\n");
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
        int[] arr={4,8,3,1,6,7};
        int size = arr.length-1;
        System.out.println("Unsorted!!");
        System.out.println(Arrays.toString(arr));
        sort(arr,0,size);
        System.out.println("sorted!!");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        quick_sort.test();
    }
}
 