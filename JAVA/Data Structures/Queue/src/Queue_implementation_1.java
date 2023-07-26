import java.util.ArrayList;
import java.util.Scanner;

class Queue {
    public int rear, front;
    public int[] queue;
    public Queue(int size) {
        rear = front = -1;
        queue = new int[size];
    }

    //inQueue
    public void inQueue(int num) {
        if (!isFull()) {
            if (front == -1) {front = 0;}
            rear++;
            queue[rear] = num;
        } else {
            System.out.println("Can not enter in Queue");
        }
    }

    //deQueue

    public int deQueue() {
        int value = 0;
        if (!isEmpty()) {
            front++;
            value = queue[front];
        } else {
            System.out.println("Empty : " + isEmpty());
        }
        return value;
    }

    //print
    public void print() {
        if (!isEmpty()) {
            System.out.print("[");
            for (int i = front; i <= rear; i++) {
                //   System.out.println(front+"\n"+rear);
                System.out.print(" " + queue[i]);
            }
            System.out.println(" ]");
        } else {
            System.out.println(front + "\n" + rear);
            System.out.println("Empty : " + isEmpty());
        }
        System.out.println(front + "\n" + rear);
    }
    //size of a queue
    public int size() {
        return rear - front;
    }
    //is empty
    boolean isEmpty() {
        return front < 0 && rear < 0 && size() < 0;
    }
    //is full
    boolean isFull() {
        return front == 0 && rear == size();
    }
}
//
//class tester{
//    void test(){
//        Scanner scn = new Scanner(System.in);
//        Queue queue = new Queue(5);
//        int number;
//        System.out.println("Stack Operations : ");
//        while(true){
//            System.out.println("Your Operation : \n1)Push ->p\n2)Pop -> o\n3)Peek ->c\n4)Print stack -> s\n5)IsEmpty -> e\n6)End -> x");
//            System.out.print("Enter Operater : ");
//            char operater = scn.next().charAt(0);
//            switch (operater){
//                case 'p':
//                    System.out.println("\t\t\tEnter Number to Push");
//                    number = scn.nextInt();
//                    stack.push(number);
//                    break;
//                case 'o':
//                    stack.pop();
//                    break;
//                case 'c':
//                    System.out.println("\t\t\tEnter Number to Peek");
//                    number = scn.nextInt();
//                    stack.push(number);
//                    break;
//                case 'e':
//                    System.out.println(stack.peek());
//                    break;
//                case 's':
//                    stack.print();
//                    break;
//                default:
//                    System.out.println("\t\t\tEnter Valid Operater");
//                    break;
//            }
//            if(operater == 'x'){
//                break;
//            }
//        }
//    }
//}

public class Queue_implementation_1 {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
//        System.out.println(queue.size());
//        queue.print();
//        System.out.println(queue.isFull());

        queue.inQueue(1);
        queue.inQueue(2);
        queue.inQueue(1);
        queue.inQueue(2);

        System.out.println(queue.size());
        queue.print();
        System.out.println("Is Full : " + queue.isFull());
//        System.out.println("Deque: "+queue.deQueue());
//        queue.print();
//        System.out.println("Size : "+queue.size());
//        System.out.println("Is Full : "+queue.isFull());
//        System.out.println("Deque: "+queue.deQueue());
//        queue.print();
//        System.out.println("Size : "+queue.size());
//        System.out.println("Is Full : "+queue.isFull());
    }
}
