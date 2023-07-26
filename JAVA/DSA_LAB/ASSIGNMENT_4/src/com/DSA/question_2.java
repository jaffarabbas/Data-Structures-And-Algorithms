package com.DSA;


class Selection{
    public void Selection_Sort(int arr[],int size){
        int i,j,min,temp,count=0,count2=0,count3=0;
        for ( i = 0; i < size - 1; i++) {
            min = i;//0,5
            for(j = i+1; j < size; j++){
                if(arr[min] > arr[j]){//0,1,   5>4 , 1 > 2 4 > nm
                    min = j;// min =1, j=1
                    count2++;//counter only
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

                count3++;
            }
            count++;
        }
        System.out.println("count i : "+count+"\ncount j : "+count2+"\nSwap : "+count3);
    }
}
public class question_2 {
    public static void main(String[] args) {
        Selection sort = new Selection();
        int arr[] = {5,6,1,1,8,9,3,5};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.Selection_Sort(arr, arr.length);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
