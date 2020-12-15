
//with inner class concept
class LinkList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //print Link List
    public void PrintList(){
        Node number = head;
        while (number!=null){
            System.out.println(number.data);
            number = number.next;
        }
    }
}

public class LinkList_Implementation_1 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        //initial head node will null
        //first node will 1 have a node that point to second node e.g= head -> null-next->first->1-next->second->2-next->third->3-next->null
        list.head = new LinkList.Node(1);
        LinkList.Node second = new LinkList.Node(2);
        LinkList.Node third = new LinkList.Node(3);

        list.head.next = second;
        second.next = third;

        list.PrintList();
    }
}
