package com.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class quiz {
    public static void bubbleSort(int[] arr){
        int avg = arr.length;
        int i,j,temp;
        for(i=0;i<avg;++i){
            for(j=0;j<(avg-i)-1;++j){
                if(arr[j]  > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={12,31,23,18,10};
        int[] arr2 ={45,23,41,12,33};
        int[] arr3 = {34,21,40,36,31};

        int avg = (arr.length + arr2.length + arr3.length) / 3;

        quiz.bubbleSort(arr);
        quiz.bubbleSort(arr2);
        quiz.bubbleSort(arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int ar1=0,ar2=0,ar3=0;
        int count=0;
        while(count<avg){
            if(arr[count] > arr2[count] && arr[count] > arr3[count]){
                ar1++;
            }
            if(arr2[count] > arr[count] && arr2[count] > arr3[count]){
                ar2++;
            }
            if(arr3[count] > arr[count] && arr3[count] > arr2[count]){
                ar3++;
            }
            count++;
        }
        System.out.println("Student 1 : "+ar1+"\nStudent 2 : "+ar2+"\nStudent 3 : "+ar3);
    }
}
