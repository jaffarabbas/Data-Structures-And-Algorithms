

class Bubble{
    public void sort(int arr[],int size){
        int i,j,temp,count=0,count2=0,count3=0;
        for(i=0;i<size-1;i++){//0
            for(j=0;j<(size-i)-1;j++){//5-0-1=4,5-1-1=3,5-2-1=2
                if(arr[j] > arr[j+1]){//
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   count3++;
                }
                count2++;//counter only
            }
            count++; 
        }

        System.out.println("count i : "+count+"\ncount j : "+count2+"\nSwap : "+count3);
    }
}


public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("Bubble");
        Bubble sort = new Bubble();
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
