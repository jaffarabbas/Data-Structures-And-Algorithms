import java.util.Arrays; 

class Slection{
    public void Selection_Sort(int arr[],int size){
        int i,j,min,temp,count=0,count2=0,count3=0;
        boolean flag = false;
        System.out.println(Arrays.toString(arr));
        for ( i = 0; i < size - 1; i++) {
            System.out.println("i:"+i);
            min = i;//0,5
            for(j = i+1; j < size; j++){
                if(arr[min] > arr[j]){//0,1,   5>4 , 1 > 2 4 > nm
                    min = j;// min =1, j=1
                    count2++;//counter only
                }
                int key = arr[min]; 
                while (min > i)  
                { 
                    arr[min] = arr[min - 1]; 
                    min--; 
                } 
                arr[i] = key; 
                flag = true;         
                System.out.println("j: "+j+" --> "+Arrays.toString(arr)+" swap-> "+flag);  
                flag = false;
                count3++;
            }
            count++;
        }
        System.out.println("count i : "+count+"\ncount j : "+count2+"\nSwap : "+count3);
    }
}
public class Selection_sort {
    public static void main(String[] args) {
        Slection sort = new Slection();
        int arr[] =  {5,6,1,1,8,9,3,5};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.Selection_Sort(arr, arr.length);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
