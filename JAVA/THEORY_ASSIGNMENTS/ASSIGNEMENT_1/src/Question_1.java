import java.util.Random;
import java.util.Scanner;

class Queue {
    public int front, rear;
    public int SIZE;
    public int[] queue;

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
                front++;
            }
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
        }
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

class stock{
    Scanner scn = new Scanner(System.in);
    boolean decision;
    float UnderValue,OverValue;
    void CheckingValue(Queue queue){
        float avg=0;
        System.out.println("Comparing Values");
        UnderValue = 10;
        OverValue = 50;
        queue.print();
        //adding all value from queue and taking there average
        for(int i  = 0;i<queue.SIZE;++i){
            avg+=queue.deQueue();
        }
        float result = avg/queue.SIZE;
        if(result > UnderValue){
            decision = true;
        }else if(result <= UnderValue){
            decision = false;
        }
        if(decision){
            System.out.println("Under Value : "+UnderValue+"\nOver Value : "+OverValue+"\nCompared Value : "+result);
            System.out.println("Buy this Stocks");
        }else{
            System.out.println("Under Value : "+UnderValue+"\nOver Value : "+OverValue+"\nCompared Value : "+result);
            System.out.println("Don't Buy!!");
        }
    }
    void Update(Queue queue){
       while(!queue.isEmpty()){
           queue.deQueue();
           System.out.println("Filtering!!!");
       }
       if(queue.isEmpty()){
           while (!queue.isFull()){
               System.out.println("Add new Data");
               int num = scn.nextInt();
               queue.enQueue(num);
           }
       }
    }
    public stock(Queue queue){
        System.out.println("Select \n1)Checking Values\n2)Update\n3)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    CheckingValue(queue);
                    break;
                case 2:
                    Update(queue);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            if(number == 3){
                break;
            }
        }
    }
}
// Question a
class a{
    public a(){
        Queue queue = new Queue(5);
        Random rand = new Random();
        //First stock random
        for (int i = 0 ;i<queue.SIZE;i++){
            int value = rand.nextInt(100);
            queue.enQueue(value);
        }
        stock st = new stock(queue);
    }
}

//****************************question 1 ka b****************************
class NYSE{
    Scanner scn = new Scanner(System.in);
    public float LimitPrice,LimitPriceForSell;
    public void BuyOrder(Queue queue){
        System.out.println("Buy New Item to Stocks ");
        int num  = scn.nextInt();
        if(num <= LimitPrice){
            queue.enQueue(num);
            System.out.println("Stock Brought");
        }else{
            System.out.println("Grater then Limit Prise");
        }
    }
    public void SellOrder(Queue queue){
        System.out.println("Sell New Item form the Stocks");
        int SailedCheck  = queue.deQueue();
        if(SailedCheck >= LimitPriceForSell){
            System.out.println("Stock Sailed");
        }else{
            queue.enQueue(SailedCheck);
            System.out.println("Lower Then Limit");
        }
    }
    public NYSE(){
        this.LimitPrice = 5000;
        this.LimitPriceForSell = 2000;
    }
}
class b{
    Queue queue = new Queue(5);
    Scanner scn = new Scanner(System.in);
    NYSE obj = new NYSE();
    public b(){
        System.out.println("1)Buy new Stocks\n2)Sell new Stocks\n3)View Limit price\n4)Show Stock\n5)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    obj.BuyOrder(queue);
                    break;
                case 2:
                    obj.SellOrder(queue);
                    break;
                case 3:
                    System.out.println("Limit Price : "+obj.LimitPrice);
                    break;
                case 4:
                    queue.print();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            if(number == 5){
                break;
            }
        }
    }
}
public class Question_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1)Part A \n2)Part B\n3)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    a stock = new a();
                    break;
                case 2:
                    b NYC = new b();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            if(number == 3){
                break;
            }
        }
    }
}
