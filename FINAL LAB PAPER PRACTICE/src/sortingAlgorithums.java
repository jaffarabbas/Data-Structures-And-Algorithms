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
    public static void merge(int[] arr,int low,int mid,int high){
        int i,j,k;
        i=low;k=low;j=mid+1;
        int[] temp = new int[high+1];
        while (i<=mid&&j<=high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else{
                temp[k] = arr[j];
                j++;k++;
            }
        }
        while (i<=mid){
            temp[k] = arr[i];
            i++;k++;
        }
        while (j<=high){
            temp[k] = arr[j];
            j++;k++;
        }
        for(int loop=low;loop<=high;++loop){
            arr[loop] = temp[loop];
        }
    }
    public static void sort(int[] arr,int low,int high){
        int mid;
        if(low<high){
            mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}

class QuickSort{
     public static int partition(int[] arr,int low,int high){
         int pivot = arr[high];
         int i = (low-1);
         int temp;
         for (int j = low ; j<high ; ++j){
             if(arr[j] < pivot){
                 i++;
                 temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
         }
         temp = arr[i+1] ;
         arr[i+1] = arr[high];
         arr[high] = temp;
         return i+1;
     }
     public static void sort(int[] arr,int low,int high){
         if(low < high){
             int pivot  = partition(arr,low,high);
             sort(arr,low,pivot-1);
             sort(arr,pivot+1,high);
         }
     }
}
public class sortingAlgorithums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        int[] arr = {5,4,3,1,2};
        //BubbleSort.sort(arr);
        //SelectionSort.sort(arr);
        //InsertionSort.sort(arr);
        //QuickSort.sort(arr,0,arr.length-1);
        MergeSort.sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
