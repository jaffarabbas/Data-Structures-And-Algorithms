
class BinarySearch{
    static int mid,count=0;
    static boolean flag = false;
    public static void Search(int[] arr,int low,int high,int search){
        mid = (low+high)/2;
        do{
            if(search == arr[mid]){
                flag = true;
                break;
            }else if(arr[mid] < search){
                low = mid+1;
            }else if(arr[mid] > search){
                high = mid-1;
            }
            mid = (low+high)/2 ;
            count++;
        }while (low<=high);
        if(flag){
            System.out.println("value : "+arr[mid]+" in count : "+count);
        }
    }
}



public class search {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        BinarySearch.Search(arr,0, arr.length,3);
    }
}
