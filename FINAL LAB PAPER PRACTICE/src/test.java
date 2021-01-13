import java.util.Random;
import java.util.Scanner;

public class test {
    static void feelArray(int arr[],int size){
        Random rand = new Random();
        for(int i = 0 ;i<arr.length;++i){
            arr[i] = rand.nextInt(50);
        }
    }
}
