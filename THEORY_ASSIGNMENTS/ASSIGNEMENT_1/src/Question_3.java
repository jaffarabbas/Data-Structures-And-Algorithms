import java.util.Random;
import java.util.Scanner;

/****************LinkedList****************/


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
        if(head.data == value){
            System.out.println("Done");
            DeleteFirstNode();
        }else {
            while (ForwardPointer.data != value && ForwardPointer.node != null) {
                pointer = pointer.node;
                ForwardPointer = ForwardPointer.node;
            }
            if (ForwardPointer.data == value) {
                pointer.node = ForwardPointer.node;
                ForwardPointer.node = null;
            } else {
                System.out.println("Value Not Found");
            }
        }
    }
    //Search
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
    //Sort a list
    public void SortLinkedList(int numberOfNodes){
        Node currentNode;
        Node newNode;
        int i,j;
        int temp;
        for(i=numberOfNodes-2;i>=0;i--){
            currentNode = head;
            newNode = currentNode.node;
            for(j=0;j<=i;j++){
                if(currentNode.data > newNode.data){
                    temp = currentNode.data;
                    currentNode.data = newNode.data;
                    newNode.data = temp;
                }
                currentNode = newNode;
                newNode = newNode.node;
            }
        }
    }
    //merge to list
    public void MergeLinkedList(LinkedList list,LinkedList list2,LinkedList list3){
          Node pointer = list.head;
          while (pointer.node!=null){
              pointer = pointer.node;
          }
          pointer.node = list2.head;
          if(list3.head == null){
              list3.head = list.head;
          }
    }
    //count even odd nodes
    public void CountEvenOdds(){
        Node pointer = head;
        int even=0,odd=0;
        while (pointer.node!=null){
            if(pointer.data%2==0){
                even++;
            }else{
                odd++;
            }
            pointer = pointer.node;
        }
        System.out.println("Even : "+even+"\nOdd : "+odd);
    }
}

class test{
    public test(){
        System.out.println("***********Question3***********\n\n***********LinkedList***********\n\n");
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        Scanner scn = new Scanner(System.in);
        System.out.println("Number of Nodes");
        int numberOfNode = scn.nextInt();
        System.out.println("Enter list 1 elements : ");
        for(int i = 0 ; i < numberOfNode ; ++i){
            int num  =scn.nextInt();
            list.InsertList(i,num);
        }
        System.out.println("Enter list 2 elements : ");
        for(int i = 0 ; i < numberOfNode ; ++i){
            int num  =scn.nextInt();
            list2.InsertList(i,num);
        }
        System.out.println("List 1 : ");
        list.printList();
        System.out.println("List 2 : ");
        list2.printList();
        //Sort
        System.out.println("Sort Them individually");
        list.SortLinkedList(numberOfNode);
        list2.SortLinkedList(numberOfNode);
        System.out.println("List 1 After Sorting: ");
        list.printList();
        System.out.println("List 2 After Sorting: ");
        list2.printList();
        System.out.println("Merge them : ");
        mergedList.MergeLinkedList(list,list2,mergedList);
        mergedList.printList();
        System.out.println("Sort Them Again : ");
        mergedList.SortLinkedList(numberOfNode*2);
        mergedList.printList();
        System.out.println("Enter 1)Display List\n2)Delete User define Value\n3)Search Define Value\n4)count Odd and Even nodes\n5)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    mergedList.printList();
                    break;
                case 2:
                    System.out.print("Enter Number : ");
                    int num = scn.nextInt();
                    mergedList.DeleteWithValue(num);
                    break;
                case 3:
                    System.out.print("Enter Number : ");
                    int num2 = scn.nextInt();
                    System.out.println(mergedList.SearchValue(num2)+" At index : "+mergedList.Search(num2));
                    break;
                case 4:
                    mergedList.CountEvenOdds();
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


public class Question_3 {
    public static void main(String[] args) {
        test obj = new test();
    }
}
