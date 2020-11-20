package DSA;
import java.util.Arrays;
import java.util.Scanner;

class test2{
    public static void printfunc(){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        long max=0,maximum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > -1){
                max += arr[i];
                if(maximum < arr[i]){
                    maximum = arr[i];
                }
            }
        }
        System.out.println(max+" "+maximum);
    }
}

public class maxsum {
    public static void main(String[] args) {
        test2.printfunc();
    }
}
