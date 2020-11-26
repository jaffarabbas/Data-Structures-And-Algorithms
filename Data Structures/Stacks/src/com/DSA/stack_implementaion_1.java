package com.DSA;

import java.util.Scanner;

class stack{
    public final int MAX  = 1000;
    int top;
    int[] arr = new int[MAX];
    boolean isEmpty(){
        return (top < 0);
    }
    stack(){
        top  = -1;
    }
    boolean push(int num){
        if(top >= (MAX - 1)){
            System.out.println("\t\t\tStack OverFlow");
            return false;
        }else{
            arr[++top] = num;
            System.out.println("\t\t\tPush "+top+" : "+arr[top]);
            return true;
        }
    }
    int pop(){
        if (top < 0){
            System.out.println("\t\t\tStack UnderFlow");
            return 0;
        }else{
            int x = arr[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("\t\t\tStack UnderFlow");
            return 0;
        }else{
            int x = arr[top];
            return x;
        }
    }
    void print(){
        if(top < 0){
            System.out.println("\t\t\tStack UnderFlow");
        }else {
            if(top == 0){
                System.out.print("[");
                for (int i = 0; i <= top; i++) {
                    System.out.print(" "+arr[i]);
                }
                System.out.print(" ]\n");
            }else {
                System.out.print("[");
                for (int i = 0; i <= top; i++) {
                    System.out.print(" "+arr[i]);
                }
                System.out.print(" ]\n");
            }
        }
    }
}


public class stack_implementaion_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        stack stack = new stack();
        int number;
        System.out.println("Stack Operations : ");
        while(true){
            System.out.println("Your Operation : \n1)Push ->p\n2)Pop -> o\n3)Peek ->c\n4)Print stack -> s\n5)IsEmpty -> e\n6)End -> x");
            System.out.print("Enter Operater : ");
            char operater = scn.next().charAt(0);
            switch (operater){
                case 'p':
                    System.out.println("\t\t\tEnter Number to Push");
                    number = scn.nextInt();
                    stack.push(number);
                    break;
                case 'o':
                    stack.pop();
                    break;
                case 'c':
                    System.out.println("\t\t\tEnter Number to Peek");
                    number = scn.nextInt();
                    stack.push(number);
                    break;
                case 'e':
                    System.out.println(stack.peek());
                    break;
                case 's':
                    stack.print();
                    break;
                default:
                    System.out.println("\t\t\tEnter Valid Operater");
                    break;
            }
            if(operater == 'x'){
                break;
            }
        }
    }
}
