package com.DSA;

public class Main {
    public static int occurance(int arr[], int length, int key, int mid) {
        int count = 0;
        int left, right;
        boolean flag = false;

        count = 1;
        left = mid - 1;
        while (left >= 0 && arr[left] == key) {
            count++;
            left--;
            flag = true;
        }
        right = mid + 1;
        while (right <= arr.length-1 && arr[right] == key) {
            count++;
            right++;
            flag = true;
        }

        return count;
    }

    public static void main(String[] args) {
        int key = 3;
        int[] arr = {2,2,2,2,3,3,3,3,3,3,3};
        int Lp = 0;
        int Hp = arr.length -1 ;
        int mid;
        boolean flag=false;
        while (Lp <= Hp){
            mid = (Lp + Hp)/2;
            if(key == arr[mid]){
                System.out.println("Value "+key+" Occured : "+Main.occurance(arr,arr.length,key,mid));
                break;
            }
            if (arr[mid] < key)
            {
                Lp = mid+1;
            }
            else
            {
                Hp = mid-1;
            }
        }
    }
}