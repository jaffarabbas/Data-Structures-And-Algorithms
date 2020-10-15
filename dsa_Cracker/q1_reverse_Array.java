/**
 * q1_reverse_Array
 */
import java.util.*;
import java.util.Scanner;

public class q1_reverse_Array {

    void arry_reverse(int arr[],int low,int high){
        int temp;
        while(low < high){//low = 0 , high = 4   ,0 , 1 , 2 , 3  = 0 
            temp = arr[low];//arr[low] =  arr[0] : 1 , temp = 1 , arr[0] = null
            arr[low] = arr[high];//arr[0]
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        q1_reverse_Array obj = new q1_reverse_Array();
        int arr[] = new int[5];

        for(int i = 0; i <arr.length;i++){
            arr[i] = scn.nextInt();
        }
        obj.arry_reverse(arr,0,arr.length-1);

        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]);
        }

       

    }
}