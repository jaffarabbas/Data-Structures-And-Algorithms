package com.DSA;

public class question_1 {
    public static void main(String[] args) {
        //bubble sort
        int[] arr = {44,5,3,2,34,4,7,8,9};
        int i,j,min,temp;

        for(int num: arr){
            System.out.println("Array Index before Sort : "+num);
        }
        for (i = 0; i < arr.length - 1; i++) {//i=0
            min = i;//0
            for (j = 0; j < (arr.length - i) - 1; j++) {//j=0
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n");
        for(int num: arr){
            System.out.println("Array Index : "+num);
        }
    }
}
