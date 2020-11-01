

class Slection{
    public void Selection_Sort(int arr[],int size){
        int i,j,min,temp,count=0,count2=0;
        for ( i = 0; i < size - 1; i++) {
            min = i;//0,5
            for(j = i+1; j < size; j++){
                if(arr[min] > arr[j]){//0,1,   5>4 , 1 > 2 4 > nm
                    min = j;// min =1, j=1
                    count2++;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            count++;
        }
        System.out.println("count:i"+count+"\ncountj"+count2);
    }
}


public class Selection_sort {
    public static void main(String[] args) {
        Slection sort = new Slection();
        int arr[] = {5,4,3,2,1};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.Selection_Sort(arr, arr.length);
        for(int num:arr){
            System.out.print(num);
        }
    }
}
