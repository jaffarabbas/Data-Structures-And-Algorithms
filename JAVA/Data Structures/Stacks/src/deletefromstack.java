
import java.util.Scanner;
import java.util.Stack;

class deletefromstack{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner scn = new Scanner(System.in);
        int key,temp=0,count=0;
        boolean flag = false;
        s1.push(10);
        s1.push(33);
        s1.push(4);
        s1.push(55);
        s1.push(3);
        s1.push(50);
        s1.push(41);
        s1.push(32);
        s1.push(29);
        s1.push(10);
        System.out.println(s1);
        System.out.println("Your Desired Value to delete : ");
        key = scn.nextInt();
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