import java.util.Arrays; 

class InsertionSort{
    public void sort(int arr[],int size){
        int i,j,key,count=0,count2=0,count3=0;
        for(i=1;i<size;i++){//i=1,arr[1] = 5
            key = arr[i];// key = 5
            j = i-1; // j=1-1 = 0 
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];//0+1 = 1 = 0, 5 = 5
                j--;//0-1 = -1 flase while loop 
                count2++;
            }
            count++;
            arr[j+1] = key;//-1+1 = 0 , 
            if(arr[j+1] == key){
                count3++;
            }
        }
        System.out.println("count i : "+count+"\ncount j : "+count2+"\nSwap : "+count3);
    }
}



class insertion_sort{
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int arr[] = {43,33,12,19,2,24,15,65,45,28};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.sort(arr, arr.length);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}