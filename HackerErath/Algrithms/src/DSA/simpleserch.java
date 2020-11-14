package DSA;

import java.util.Scanner;

public class simpleserch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        boolean flag = false;
        int value=0;
        for(int i = 0 ; i<arr.length;i++){
           if(arr[i] == key){
               flag = true;
               value = i;
               break;
           }
        }
        if(flag){
           System.out.println(value);
        }
    }
}
