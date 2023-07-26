//class Queue {
//    int front, rear, size;
//    int capacity;
//    int array[];
//
//    public Queue(int capacity)
//    {
//        this.capacity = capacity;
//        front = this.size = 0;
//        rear = capacity - 1;
//        array = new int[this.capacity];
//    }
//
//    // Queue is full when size becomes
//    // equal to the capacity
//    boolean isFull(Queue queue)
//    {
//        return (this.size == capacity);
//    }
//
//    // Queue is empty when size is 0
//    boolean isEmpty(Queue queue)
//    {
//        return (this.size == 0);
//    }
//
//
//    // It changes rear and size
//    void Enqueue(int item)
//    {
//        if (isFull(this))
//            return;
//        this.rear = (this.rear + 1) % this.capacity;
//        this.array[this.rear] = item;
//        this.size = this.size + 1;
//        System.out.println(item + " Enqueued to queue");
//    }
//
//    //  remove an item from queue.
//    // It changes front and size
//    int  Dequeue()
//    {
//        if (isEmpty(this))
//            return Integer.MIN_VALUE;
//
//        int item = this.array[this.front];
//        this.front = (this.front + 1) % this.capacity;
//        this.size = this.size - 1;
//        return item;
//    }
//
//    //  get front of queue
//    int Get_Front()
//    {
//        if (isEmpty(this))
//            return Integer.MIN_VALUE;
//
//        return this.array[this.front];
//    }
//
//    //  get rear of queue
//    int Get_Rear()
//    {
//        if (isEmpty(this))
//            return Integer.MIN_VALUE;
//
//        return this.array[this.rear];
//    }
//}
//
//
//public class samin_question {
//    public static void main(String[] args)
//    {
//        Queue queue = new Queue(10);
//
////        queue.Enqueue(9);
////        queue.Enqueue(4);
////        queue.Enqueue(3);
////        queue.Enqueue(10);
//
//        queue.Enqueue(4);
//        System.out.println(queue.Dequeue() + " Dequeued from queue\n");
//
//        System.out.println("Front item is "+ queue.Get_Front());
//
//        System.out.println("Rear item is " + queue.Get_Rear());
//    }
//}