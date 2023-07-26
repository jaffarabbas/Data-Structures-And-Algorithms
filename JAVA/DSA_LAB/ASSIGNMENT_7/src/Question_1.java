
import java.util.ArrayList;
import java.util.Scanner;

class Queue {
    int front, rear;
    int SIZE;
    int[] queue;

    public Queue(int num) {
        front = -1;
        rear = -1;
        this.SIZE = num;
        queue = new int[this.SIZE];
    }

    // insert elements to the queue
    public void enQueue(int num) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                // mark front denote first element of queue
                front = 0;
            }
            rear++;
            // insert element at the rear
            queue[rear] = num;
         //   System.out.println("Insert " + num);
        }
    }

    // delete element from the queue
    public int deQueue() {
        int element;
        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            // remove element from the front of queue
            element = queue[front];
            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                // mark next element as the front
                front++;
            }
           // System.out.println(element + " Deleted");
            return (element);
        }
    }

    // display element of the queue
    public void print(){
        if(!isEmpty()){
            System.out.print("[");
            for(int i = front;i<=rear;i++){
                //   System.out.println(front+"\n"+rear);
                System.out.print(" "+ queue[i]);
            }
            System.out.println(" ]");
        }else{
  //         System.out.println(front+"\n"+rear);
  //          System.out.println("Empty : "+isEmpty());
        }
   ///     System.out.println("front : "+front+"\nRear : "+rear);
    }

    //getting Front
    public int Getting_Front(){
        if(!isEmpty()){
            return queue[front];
        }else{
            System.out.println("Empty!!!!");
            return 0;
        }
    }
    //getting rear
    public int Getting_Rear(){
       if(!isEmpty()){
           return queue[rear];
       }else{
           System.out.println("Empty!!!!");
           return 0;
       }
    }

    public boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}

class test{
    void test2(){
        Queue obj = new Queue(15);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.enQueue(3);
        obj.enQueue(8);
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.enQueue(9);
        obj.print();

        obj.deQueue();
        obj.deQueue();
        //b
        obj.enQueue(5);
        obj.enQueue(4);
        obj.deQueue();
        obj.deQueue();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.print();
    }
}

public class Question_1 {
    public static void main(String[] args) {
        test obj = new test();
        obj.test2();
    }
}
