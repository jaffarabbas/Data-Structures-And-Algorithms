import java.util.Arrays;

class InsertionSort {
    //5,4,3,2,1
    public void sort(int arr[], int size) {
        int i, j, key, count = 0, count2 = 0, count3 = 0;
        for (i = 1; i < size; i++) { //i=1,arr[1] = 5
            System.out.println("i:" + i);
            key = arr[i];// key = 5
            j = i - 1; // j=1-1 = 0
            System.out.println("j:" + j);
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; //0+1 = 1 = 0, 5 = 5
                j--;//0-1 = -1 flase while loop
                count2++;
                System.out.println("j : " + j + " " + Arrays.toString(arr));
            }
            count++;
            arr[j + 1] = key; //-1+1 = 0 ,
            System.out.println("j : " + j + "                           " + Arrays.toString(arr));
            count3++;
            //      System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("count i : " + count + "\ncount j : " + count2 + "\nSwap : " + count3);
    }
}



class insertion_sort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int arr[] =  {5 , 3, 8, 9, 1, 7, 0, 2};
        // for(int num:arr){
        //     System.out.print(" "+num);
        // }
        sort.sort(arr, arr.length);
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }
}