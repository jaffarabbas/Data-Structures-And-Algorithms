package com.DSA;

import java.util.Arrays;

public class merge_sort {
    static void merge(int[] arr,int low,int mid,int high){
        int i,j,k;
        i=low;j=high;k=low;
        int[] temp = new int[high+1];
        while(i<=mid&&j<=high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
            while (i <= mid) {
                temp[k]=arr[i];
                k++;i++;
            }
            while(j<=high){
                temp[k] = arr[j];
                k++;j++;
            }
            for(i=low;i<=high;i++){
                arr[i] = temp[i];
            }
        }
    }
    static void sort(int[] arr,int low,int high){
        int mid;
        if(low<high){
            mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
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
        merge_sort.test();
    }
}
