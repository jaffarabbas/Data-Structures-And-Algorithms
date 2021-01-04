import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;
    public Node root;

    public Node(int value){
        this.data = value;
    }
    //traversal In Order
    public void traversalInorder(){
        if(left!=null){
            left.traversalInorder();
        }
        System.out.print(data+" , ");
        if(right!=null){
            right.traversalInorder();
        }
    }
}

class BinaryTree{
    public Node root;

    public void traversalInorder(){
        if(root!=null){
            root.traversalInorder();
        }
    }
    //Complete Binary Tree
    public Node CompleteBinaryTree(int[] arr,Node root,int index){
        if(index < arr.length){
            Node NewNode = new Node(arr[index]);
            root = NewNode;

            root.left = CompleteBinaryTree(arr,root.left,2*index+1);
            root.right = CompleteBinaryTree(arr,root.right,2*index+2);
        }
        return root;
    }
}


public class Question_2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert How many values");
        int size  = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i<size;i++){
            System.out.println("Enter : ");
            int insertNumber  = scn.nextInt();
            arr[i] = insertNumber;
        }
        tree.root = tree.CompleteBinaryTree(arr,tree.root,0);
        System.out.println("Method To Insert Complete Binary Tree : ");
        tree.traversalInorder();
    }
}
