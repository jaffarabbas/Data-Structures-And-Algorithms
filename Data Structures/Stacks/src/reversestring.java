import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.*;

class reversestring {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		int size = scn.nextInt();

		for (int i = 0; i < size; i++) {
			String name =  scn.next();
			stack.push(name);
		}

		 while(!stack.isEmpty()){
		 	stack2.push(stack.pop());
		 }

		System.out.println(stack);

		System.out.println(stack2);
	}
}