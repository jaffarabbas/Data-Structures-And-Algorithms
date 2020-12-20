import java.util.Arrays; 


class Bubble{
    public void sort(int arr[],int size){
        int i,j,temp,count=0,count2=0,count3=0;
        boolean flag=false;
        for(i=0;i<size-1;i++){//0
            System.out.println("i:"+i);
            for(j=0;j<(size-i)-1;j++){//5-0-1=4,5-1-1=3,5-2-1=2
                if(arr[j] > arr[j+1]){//
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   count3++;
                   flag = true;
                }
                count2++;//counter only
                System.out.println("j: "+j+" --> "+Arrays.toString(arr)+" swap-> "+flag);  
                flag = false;
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
        int arr[] = {0,1,2,3,4,5,6,7,8,42,24,6,17,30,13,90,47,2};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.sort(arr, arr.length);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
