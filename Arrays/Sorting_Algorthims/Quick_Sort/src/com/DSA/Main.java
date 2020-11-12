package com.DSA;


import java.util.Arrays;

class quickSort{
    int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        int temp;
    do {
        while (arr[i] <= pivot) {
            i++;
        }
        while (arr[j] > pivot) {
            j--;
        }
        if (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }while (i<j);

    temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
    }
    void sort(int[] arr,int low,int high){
        int part;
        if(low<high){
            part = partition(arr,low,high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
        }
    }
    void test(){
        int arr[]={4,8,3,1,6,7};
        int low = 0;
        int high = arr.length-1;
        System.out.println("Unsorted");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted");
        sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    public quickSort(){
        test();
    }
}



public class Main {

    public static void main(String[] args) {
        quickSort obj = new quickSort();
    }
}
