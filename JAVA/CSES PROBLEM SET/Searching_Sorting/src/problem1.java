//distinct number

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int i,j,count=0;

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[arr.length];
        for(i=0;i<arr.length;++i){
            arr[i] = scn.nextInt();
        }
        for (i=0;i<arr.length;i++){
            for (j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    temp[i] = arr[i];
                }
            }
        }
        System.out.println(count);
    }
}
