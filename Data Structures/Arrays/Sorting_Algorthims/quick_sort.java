


class sol1{
    int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=(low-1),j=high,temp;
        do{
            while(i < high&&arr[++i]<=pivot)
                
            while(arr[j] > pivot){
                j--;
            }
            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<j);
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
     void sort(int[] arr,int low,int high){
        if(low < high){
            int partition = partition(arr,low,high);
            sort(arr,low,partition-1);
            sort(arr,partition+1,high);
        }
    }
     void test(){
        int arr1[] = {5,4,3,2,1,77,5,3,55,33,44,22};

        sort(arr1,0,arr1.length-1);
        // merge(arr1,0,2,4);
        for(int num:arr1){
            System.out.print(" "+num);
        }
    }
}

class sol2{

    int partition(int[] arr,int low,int high){
        int piviot = arr[high];
        int i = low - 1,temp;
        for(int j=low;j<high;++j){
            if(arr[j] > piviot){
                i++;
                temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void sort(int[] arr,int low,int high){
        if(low < high){
            int partition = partition(arr,low,high);
            sort(arr,low,partition-1);
            sort(arr,partition+1,high);
        }
    }
     void test(){
        int arr1[] = {4,8,3,1,6,7};

        sort(arr1,0,arr1.length-1);
        // merge(arr1,0,2,4);
        for(int num:arr1){
            System.out.print(" "+num);
        }
    }
}

public class quick_sort{
    public static void main(String[] args) {
   //      sol1 object_1 = new sol1();
         sol2 object_1 = new sol2();
         object_1.test();
    }
}