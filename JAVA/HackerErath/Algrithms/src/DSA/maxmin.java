package DSA;


import java.util.Arrays;
import java.util.Scanner;
//1 7 4 0 9 4 8 8 2 4
class test{
    public static void printfunc(){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        long max=0,min=0;
        for (int i = 0; i < (arr.length-1); i++) {
            min += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        System.out.println(min+" "+max);
    }
}
public class maxmin {
    public static void main(String[] args) {
        test.printfunc();
    }
}
