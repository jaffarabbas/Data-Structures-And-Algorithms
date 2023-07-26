import java.util.*;

class Main
{
    static Node head_ref;

    static class Node
    {
        int data;
        Node next;
    };

    // Function to insert a node at the
    // beginning of the linked list
    static Node push(int new_data)
    {
        // allocate node
        Node new_node = new Node();
        // put in the data
        new_node.data = new_data;
        // link the old list at the end of the new node
        new_node.next = head_ref;

        // move the head to point to the new node
        head_ref = new_node;
        return head_ref;
    }

    // function to print the linked list
    static void printList(Node head)
    {
        if (head == null)
        {
            return;
        }

        while (head.next != null)
        {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print(head.data + "\n");
    }

    static void deleteNode(int key)
    {
        // Store head node
        Node temp = head_ref, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head_ref = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Function to middle node of list.
    static Node find_mid(Node head)
    {
        Node temp = head, slow = head, fast = head;

        while (fast != null && fast.next != null)
        {

            // Advance 'fast' two nodes, and  
            // advance 'slow' one node
            slow = slow.next;
            fast = fast.next.next;
        }

        // If number of nodes are odd then update slow
        // by slow.next;
        if (fast != null)
        {
            slow = slow.next;
        }

        return slow;
    }

    // function to modify the contents of the linked list.
    static void modifyTheList(Node head, Node slow)
    {
        // Create Stack.  
        Stack<Integer> s = new Stack<Integer>();
        Node temp = head;

        while (slow != null)
        {
            s.add(slow.data);
            slow = slow.next;
        }

        // Traverse the list by using temp until stack is empty.
        while (!s.empty())
        {
            temp.data = temp.data - s.peek();
            temp = temp.next;
            s.pop();
        }

    }





    // Driver program to test above
    public static void main(String[] args)
    {
        Node head = null, mid;

        // creating the linked list
        head = push( 10);
        head = push(7);
        head = push( 12);
        head = push(8);
        head = push(9);
        head = push( 2);

        printList(head);
        deleteNode(2);

//         Call Function to Find the starting
//         point of second half of list.
        mid = find_mid(head);

        // Call function to modify
        // the contents of the linked list.
        modifyTheList(head, mid);

        // print the modified linked list
        System.out.print("Modified List:" + "\n");
        printList(head);
    }
}