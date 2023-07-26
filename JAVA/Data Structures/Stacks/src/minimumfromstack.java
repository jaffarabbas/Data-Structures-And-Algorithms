import java.util.Stack;

public class minimumfromstack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        int min,temp,count=0,size;
        s1.push(9);
        s1.push(40);
        s1.push(30);
        s1.push(20);
        s1.push(10);
        min = s1.pop();
       while(!s1.isEmpty()){
            temp = s1.pop();
            if(min > temp){
                min = temp;
            }
            count++;
        }

        System.out.println("Minimum : " + min + " In count : " + count);
    }
}
