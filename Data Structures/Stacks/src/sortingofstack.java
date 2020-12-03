import java.util.Stack;

//We follow this algorithm.
//
//        Create a temporary stack say tmpStack.
//        While input stack is NOT empty do this:
//        Pop an element from input stack call it temp
//        while temporary stack is NOT empty and top of temporary stack is greater than temp,
//        pop from temporary stack and push it to the input stack
//        push temp in temporary stack
//        The sorted numbers are in tmpStack

public class sortingofstack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        
        int temp,temp2;

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        while(!stack.isEmpty()){
            temp = stack.pop();
            while(!stack2.isEmpty() && stack2.peek() > temp){
                stack.push(stack2.pop());
            }
            stack2.push(temp);
        }

        System.out.println(stack);
    }
}
