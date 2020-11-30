package com.DSA;


import java.util.Stack;

class Stacks{
    public void stack_push(Stack<String> stack,String value){
        String check = stack.push(value);
        System.out.println("Value push : "+check);
    }
    public void stack_pop(Stack<String> stack){
        String value  = stack.pop();
        System.out.println("Poped value : "+value);
    }
    public void stack_peek(Stack<String> stack){
        String value  = stack.peek();
        System.out.println("Peek : "+value);
    }
    public void print_stack(Stack<String> stack){
        for (int i = 0; i < stack.size(); i++) {
            stack_peek(stack);
            stack_pop(stack);
        }
    }
}



public class stack_implementation_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stacks obj = new Stacks();
        obj.stack_push(stack,"dsfdsf");
        obj.stack_push(stack,"dsfdsf");
        obj.stack_push(stack,"dsfdsf");
        obj.stack_push(stack,"dsfdsf");
        obj.stack_push(stack,"3");
        obj.stack_peek(stack);
        obj.print_stack(stack);
    }
}
