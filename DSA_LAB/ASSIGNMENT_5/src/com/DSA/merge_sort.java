package com.DSA;

import java.util.Arrays;

public class merge_sort {
    static void merge(int[] arr,int low,int mid,int high){
        int i,j,k;
        i=low;j=mid+1;k=low;
        int[] temp = new int[high+1];
        while(i<=mid&&j<=high){
            if(arr[i] < arr[j]){
               // System.out.println("When arr[i] : "+arr[i]+" < arr[j] : "+arr[j]+"\n");
                temp[k] = arr[i];
                i++;k++;
                System.out.println("Temp arr of i : "+Arrays.toString(temp)+" i: "+i+" k :"+k+"");
            }else{
               // System.out.println("When arr[i] : "+arr[i]+" > arr[j] : "+arr[j]+"\n");
                temp[k]=arr[j];
                j++;k++;
                System.out.println("Temp arr of j : "+Arrays.toString(temp)+" j: "+j+" k :"+k);
            }

        }
        while (i <= mid) {
            temp[k]=arr[i];
            k++;i++;
            System.out.println("Temp arr of reaming i : "+Arrays.toString(temp)+" i: "+i+" k :"+k);
        }
        while(j<=high){
            temp[k] = arr[j];
            k++;j++;
            System.out.println("Temp arr of reaming j : "+Arrays.toString(temp)+" i: "+j+" k :"+k);
        }
        for(int loop=low;loop<=high;loop++){
            arr[loop] = temp[loop];
        }
        System.out.println(Arrays.toString(arr));
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
        int[] arr={4,8,3,1,6,7};
        int size = arr.length-1;
        System.out.println("Unsorted!!");
        System.out.println(Arrays.toString(arr)+"\n\n**********Dry Run**********\n\n");
        sort(arr,0,size);
        System.out.println("sorted!!");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        merge_sort.test();
    }
}
