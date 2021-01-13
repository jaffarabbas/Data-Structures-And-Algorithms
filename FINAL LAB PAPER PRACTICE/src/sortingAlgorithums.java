import java.util.Arrays;
import java.util.Scanner;

class BubbleSort{
    static int i,j,temp;
    public static void sort(int[] arr){
        for(i=0;i<arr.length-1;++i){
            for(j=0;j<(arr.length-i)-1;++j){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort{
    static int i,j,temp,min;
    public static void sort(int[] arr){
        for(i=0;i<arr.length;++i){
            min = i;
            for(j=0;j<arr.length-1;++j){
                if(arr[min] < arr[j]){
                    min = j;
                }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}

class InsertionSort{
    static int i,j,key,min;
    public static void sort(int[] arr){
        for(i=1;i<arr.length;++i){
            key = arr[i];
            j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

class MergeSort{
    int pivot
}

public class sortingAlgorithums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        int[] arr = {5,4,3,1,2};
        //BubbleSort.sort(arr);
        //SelectionSort.sort(arr);
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
