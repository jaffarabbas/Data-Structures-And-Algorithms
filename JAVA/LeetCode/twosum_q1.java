public class twosum_q1{
  public static void main(String args[]){
     int[] arr = {3,2,4};
     int i=0,j,target = 9;
     while(arr.length){
         int re = arr[i] + arr[i];
         if(re == target){
            for(int j = 0 ;j<i;j++){
               System.out.print(arr[j]);
            }
         }else{
         i++; 
         }
     }
  }
}
