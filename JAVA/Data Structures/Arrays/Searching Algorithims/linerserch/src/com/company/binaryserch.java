package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class binaryserch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Array KI LENGTH!!!");
        int length = obj.nextInt();
        int[] arr = new int[length];
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr);

        for (int j : arr) {
            System.out.println(j);
        }



        int start = 0 , serch, ending = arr.length;
        int count = 0;
        int mid = arr.length / 2;
        System.out.println("VAlue for serch !!!!!!!");

        serch = obj.nextInt();

        do {
            if (arr[mid] == serch) {
                System.out.println("VAlue is : at this count : " + count + " and in middle and  array index is :" + (mid + 1));
                break;
            } else if (arr[mid] < serch) {
                start = mid + 1;
            } else {
                ending = mid - 1;
            }
//            if(mid )
            mid = (start + ending) / 2;
            count++;
        } while (start <= ending);
    }
}
