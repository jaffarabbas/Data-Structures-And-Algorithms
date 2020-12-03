
import java.util.Scanner;
import java.util.Stack;

class stack_implementaion_2{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
       // Scanner scn = new Scanner(System.in);

        int key,temp=0,count=0;
        boolean flag = false;

        key = 3;

        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        int size = s1.size();
        while(!s1.isEmpty()){
            temp = s1.pop();
            size--;
            if(temp == key){
                flag = true;
                break;
            }else{
                s2.push(temp);
            }
            count++;
        }
        if(flag){
            System.out.println(temp+" at : "+size+" in count : "+count);
        }
    }
}