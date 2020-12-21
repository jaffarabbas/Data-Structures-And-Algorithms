
class LinkedList{
    public Node head;
    static class Node{
        int data;
        Node node;
        public Node(int d){
            this.data = d;
            Node node = null;
        }
    }
    //print the list
    public void printList(){
        Node value = head;
        System.out.print("[");
        while(value!=null){
            System.out.print(" "+value.data);
            value = value.node;
        }
        System.out.println(" ]");
    }
    //Method for Insertion at first index
    public void InsertAtBeginning(int newData){
        //create new Node
        Node newNode = new Node(newData);
        newNode.node = head;
        head = newNode;
    }
    //Method to print in any insertion
    public void InsertList(Node previous,int newData){
        if(previous == null){
            System.out.println("Element is null cannot push in the list");
            return;
        }
        Node newNode = new Node(newData);
        newNode.node = previous.node;
        previous.node = newNode;
    }
    //Method to insert at the last
    public void insertAtLast(int newData){
        //head is null when there is no other node
        if(head == null){
            head = new Node(newData);
            return;
        }
        Node newNode = new Node(newData);
        newNode.node = null;
        Node last = head;
        while (last.node!=null){
            last = last.node;
        }
        last.node = newNode;
    }
    //Delete Node
    
}

public class linkList_implementaion_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtBeginning(3);
        list.InsertAtBeginning(3);
        list.printList();
        list.insertAtLast(44);
        list.printList();
        list.InsertAtBeginning(6);
        list.printList();
        list.InsertList(list.head.node.node,7);
        list.printList();
        list.InsertList(list.head.node.node.node,7);
        list.printList();
    }
}
