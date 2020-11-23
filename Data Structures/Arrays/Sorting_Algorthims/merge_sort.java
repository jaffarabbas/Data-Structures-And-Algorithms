
public class merge_sort {
//    static void merge(int arr[],int low,int mid ,int high){
//         int i,j,k;
//         i=low;j=mid+1;k=low;
//         int temp[] = new int[high+1];
//         while(i<=mid&&j<=high){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;k++;
//             }else{
//                 temp[k] = arr[j];
//                 j++;k++;
//             }

//             // System.out.println("temp arr of i : "+temp[k]+" i: "+i+" k : "+k);
//         }
//         while(i<=mid){
//             temp[k] = arr[i];
//             k++;i++;
//             // System.out.println("temp arr of remaining i : "+arr[i]+" i: "+i+" k : "+k);
//         }
//         while(j<=high){
//             temp[k] = arr[j];
//             k++;j++;
//             // System.out.println("temp arr of remaining j : "+arr[j]+" j: "+j+" k : "+k);
//         }
//         for(int loop = low;loop<=high;loop++){
//             arr[loop] = temp[loop];
//              System.out.print(arr[loop]);
//         }
        
//     }
static void merge(int A[ ] , int start, int mid, int end) {
    //stores the starting position of both parts in temporary variables.
   int low = start ,middle = mid+1;
   
   int Arr[] = new int[end-start+1] ;int k=0;
   
   for(int i = start ;i <= end ;i++) {
       if(low > mid)      //checks if first part comes to an end or not .
          Arr[ k++ ] = A[ middle++] ;
   
      else if ( middle > end)   //checks if second part comes to an end or not
          Arr[ k++ ] = A[ low++ ];
   
      else if( A[ low ] < A[ middle ])     //checks which part has smaller element.
         Arr[ k++ ] = A[ low++ ];
   
      else
         Arr[ k++ ] = A[ middle++];
    }
     for ( low=0 ; low< k ;low ++) {
      /* Now the real array has elements in sorted manner including both 
           parts.*/
        A[ start++ ] = Arr[ low ] ;                          
     }
   }

    static void sort(int arr[],int low,int high){
        int mid;
        if(low < high){
            mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void test(){
        int arr1[] = {5,4,3,2,1};

        sort(arr1,0,4);
        // merge(arr1,0,2,4);
        for(int num:arr1){
            System.out.print(" "+num);
        }
    }
    public static void main(String[] args) {
        merge_sort.test();
    }
}
