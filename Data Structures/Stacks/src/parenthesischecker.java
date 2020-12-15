import java.util.Scanner;
import java.util.Stack;


public class parenthesischecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //stack
        Stack<Character> stack = new Stack<>();
        Stack<Character> check = new Stack<>();
        int size = scn.nextInt();
        char name;
        for (int i = 1; i <=size; i++) {
            name = scn.next().charAt(0);
            stack.push(name);
        }
        char temp;
        while (!stack.isEmpty()){
            temp = stack.pop();
            if(temp == '('){
                check.push(temp);
                System.out.println("temp : "+temp);
            }
            else if(temp == ')'){
                while(!check.isEmpty()){
                    if(check.pop() == '(') {
                        check.pop();
                    }
                }
             //   System.out.println(check.peek());
            }
            System.out.println(stack);

            System.out.println(check);
        }
        if(check.isEmpty()){
            System.out.println("Fully parantezized");
        }else{
            System.out.println(check.size());
        }
    }
}
