import java.util.List;

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
    //List size
    public int ListSize(){
        Node value = head;
        int count=0;
        while (value!=null){
            value = value.node;
            count++;
        }
        return (count);
    }
    //isEmpty or not
    public boolean isEmpty(){
        return (ListSize()<=0);
    }
    //isFull
    public boolean isFull(){
        return (ListSize()>0);
    }
    //Peek
    public int ListPeek(){
        if(!isEmpty()){
            return head.data;
        }else{
            return 0;
        }
    }
    //Peek First
    public int ListPeekFirst(){
        if(!isEmpty()){
            return head.data;
        }else{
            return 0;
        }
    }
    //Peek Last
    public int ListPeekLast(){
        Node value = head;
        Node lastValue = head.node;
        while (lastValue!=null){
            value = value.node;
            lastValue = lastValue.node;
        }
        return value.data;
    }
    //Method for Insertion at first index
    public void InsertAtBeginning(int newData){
        //create new Node
        Node newNode = new Node(newData);
        newNode.node = head;
        head = newNode;
    }
    //Method to print in any insertion
    public void InsertList(int index,int newData){
        if(index <= ListSize()){
            if(index <= 0){
                InsertAtBeginning(newData);
            }else if(index == ListSize()){
                InsertAtLast(newData);
            }else {
                Node newNode = new Node(newData);
                Node p = head;int count = 0;
                while(count!=index-1){
                    p = p.node;
                    count++;
                }
                newNode.node = p.node;
                p.node = newNode;
            }
        }else{
            System.out.println("Out of Bound Index must fill index : "+ListSize());
        }
    }
    //Method to insert at the last
    public void InsertAtLast(int newData){
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
    //Method Update first Node
    public void UpdateFirstNode(int value){
        Node pointer = head;
        pointer.data = value;
    }
    //Update Last
    public void UpdateLastNode(int value){
        if(head == null){
            System.out.println("Empty : "+isEmpty());
            return;
        }
        Node last = head;
        while (last.node!=null){
            last = last.node;
        }
        last.data = value;
    }
    //Update at index
    public void UpdateAtIndex(int index,int value){
        if(index <= ListSize()){
            if(index <= 0){
                UpdateFirstNode(value);
            }else if(index == ListSize()){
                UpdateLastNode(value);
            }else {
                Node p = head;int count = 0;
                while(count!=index-1){
                    p = p.node;
                    count++;
                }
                p.data = value;
            }
        }else{
            System.out.println("Out of Bound Index must fill index : "+ListSize());
        }
    }
    //Update by Value
    public void UpdateByValue(int value,int data){
        Node pointer = head;
        while (pointer.data != value && pointer.node!=null){
            pointer = pointer.node;
        }
        if(pointer.data == value){
            pointer.data = data;
        }else{
            System.out.println("Value Not Found");
        }
    }
    //*************Delete Node*************
    //Delete at First
    public void DeleteFirstNode(){
        Node value = head;
        head = head.node;
        value.node = null;
    }
    //Delete with any index
    public void DeleteAtIndex(int index){
        if(index <= ListSize()){
            if(index <= 0){
                DeleteFirstNode();
            }else if(index == ListSize()){
                DeleteLastNode();
            }else {
                Node value = head;
                Node ForwardNode = head.node;
                for(int i= 0 ;i<index-1;i++){
                    value = value.node;
                    ForwardNode = ForwardNode.node;
                }
                value.node = ForwardNode.node;
                ForwardNode.node = null;
            }
        }else{
            System.out.println("Out of Bound Index must fill index : "+ListSize());
        }
    }
    //Delete at Last
    public void DeleteLastNode() {
        Node value = head;
        Node ForwardValue = head.node;
        while (ForwardValue.node!=null){
            value = value.node;
            ForwardValue = ForwardValue.node;
        }
        value.node = null;
        ForwardValue.node = null;
    }
    //Delete with Value
    public void DeleteWithValue(int value){
        Node pointer = head;
        Node ForwardPointer = head.node;
        while (ForwardPointer.data != value && ForwardPointer.node!=null){
            pointer = pointer.node;
            ForwardPointer = ForwardPointer.node;
        }
        if(ForwardPointer.data == value){
            pointer.node = ForwardPointer.node;
            ForwardPointer.node = null;
        }else{
            System.out.println("Value Not Found");
        }
    }
    //Search index
    public int Search(int value){
        Node pointer = head;int count=0;
        while (pointer.data != value && pointer.node!=null){
            pointer = pointer.node;
            count++;
        }
        if(pointer.data == value){
            return count;
        }else{
            return 0;
        }
    }
    //Search by index
    public int SearchValue(int value){
        Node pointer = head;int count=0;
        while (pointer.data != value && pointer.node!=null){
            pointer = pointer.node;
            count++;
        }
        if(pointer.data == value){
            return pointer.data;
        }else{
            return 0;
        }
    }
}

public class LinkList_Implementation_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtBeginning(1);
        list.InsertAtLast(2);
        list.InsertAtLast(3);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        list.InsertAtLast(6);

//        System.out.println(list.ListSize());
//        System.out.println(list.ListPeek());
//        System.out.println(list.ListPeekLast());

//        list.DeleteWithValue(7);
//        list.DeleteFirstNode();
//          list.DeleteAtIndex(6);
//        list.DeleteLastNode();
//        list.printList();
//        System.out.println(list.isEmpty());
//        System.out.println(list.isFull());
//        list.printList();
//    //    list.InsertList(2,6);
//        list.UpdateFirstNode(4);
//        list.UpdateLastNode(55);
//        list.UpdateAtIndex(1,44444);
//        list.UpdateByValue(2,4);
//        list.DeleteWithValue(3);
        list.printList();
        System.out.println(list.Search(99));
    }
}
