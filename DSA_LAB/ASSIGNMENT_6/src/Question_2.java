import java.util.Stack;

public class Question_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int temp;
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Unsorted : ");
        System.out.println(stack);
        while(!stack.isEmpty()){
            temp = stack.pop();
            while(!stack2.isEmpty() && stack2.peek() > temp){
                stack.push(stack2.pop());
            }
            stack2.push(temp);
        }
        System.out.println("Sorted : ");
        System.out.println(stack2);
    }
}
