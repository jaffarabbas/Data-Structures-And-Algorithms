import java.util.Arrays;

class Main{
    public static void main (String[] args) {
        int arr[] = {5,6,1,1,8,9,3,5};
        System.out.println(Arrays.toString(arr));   
        int size = arr.length;
        int i,j,min,temp;
        
        for (i=0;i<size-1;i++){
            min = i;
            for (j=i+1;j<size;j++){
                min = j;
                if(arr[j] < arr[min]){
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            } 
        } 
        
    System.out.println(Arrays.toString(arr));   
    }
}