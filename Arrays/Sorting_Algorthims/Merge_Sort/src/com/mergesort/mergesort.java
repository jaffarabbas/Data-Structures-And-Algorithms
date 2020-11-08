package com.mergesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesort {
    static void merge(int[] arr,int low,int mid,int high){
        int i,j,k;
        i=low;j=mid+1;k=low;//0,1,0
        int[] temp = new int[high+1];
        while(i<=mid&&j<=high){//i =0
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        //for remaining elemnets
        while(i<=mid){
            temp[k] = arr[i];
            k++;i++;
        }
        while(j<=high){
            temp[k] = arr[j];
            k++;j++;
        }
        for(int loop = low;loop<=high;loop++){
            arr[loop] = temp[loop];
        }
    }
    static void sort(int arr[],int low,int high){
        int mid;
        if(low < high){
            mid=(low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void test(){
        int[] arr={10,5,4,22,6,7,11,8,2,1,3,9};
        int low = 0;
        int high = arr.length-1;
        System.out.println("Non sorted");
        System.out.println(Arrays.toString(arr));
        sort(arr,low,high);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        mergesort.test();
    }
}
