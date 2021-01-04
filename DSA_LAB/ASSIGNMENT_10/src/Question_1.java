//import java.util.Scanner;
//
//class Node{
//    public int data;
//    public Node left;
//    public Node right;
//    public Node root;
//
//    public Node(int value){
//        this.data = value;
//    }
//    //Insert a tree
//    public void insert(int value){
//        if(value == data){
//            return;
//        }
//        if(value < data){
//            if(left == null){
//                System.out.println("Entered In Left");
//                left = new Node(value);
//            }else{
//                System.out.println("Entered In Left");
//                left.insert(data);
//            }
//        }else{
//            if(right == null){
//                System.out.println("Entered In Right");
//                right = new Node(value);
//            }else{
//                System.out.println("Entered In Right");
//                right.insert(value);
//            }
//        }
//    }
//    //traversal In Post Order
//    public void traversalInPostOrder(){
//        if(left!=null){
//            left.traversalInPostOrder();
//        }
//        if(right!=null){
//            right.traversalInPostOrder();
//        }
//        System.out.print(data+" , ");
//    }
//    //traversal In Order
//    public void traversalInorder(){
//        if(left!=null){
//            left.traversalInorder();
//        }
//        System.out.print(data+" , ");
//        if(right!=null){
//            right.traversalInorder();
//        }
//    }
//    //traversal In PreOrder
//    public void traversalInPreOrder(){
//        System.out.print(data+" , ");
//        if(left!=null){
//            left.traversalInPreOrder();
//        }
//        if(right!=null){
//            right.traversalInPreOrder();
//        }
//    }
//}
//
//class BinaryTree{
//    public Node root;
//
//    public void insert(int value){
//        if(root == null){
//            root = new Node(value);
//        }else{
//            root.insert(value);
//        }
//    }
//
//    //traversal
//    public void traversalInPostOrder(){
//        if(root!=null){
//            root.traversalInPostOrder();
//        }
//    }
//
//    public void traversalInorder(){
//        if(root!=null){
//            System.out.println("Entered In Root");
//            root.traversalInorder();
//        }
//    }
//
//    public void traversalInPreOrder(){
//        if(root!=null){
//            root.traversalInPreOrder();
//        }
//    }
//
//}
//
//
//public class Question_1 {
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Insert How many values");
//        int size  = scn.nextInt();
//        for (int i = 0 ; i<size;i++){
//            System.out.println("Enter : ");
//            int insertNumber  = scn.nextInt();
//            tree.insert(insertNumber);
//        }
//        System.out.println("In Order : ");
//        tree.traversalInorder();
//        System.out.println("\nPost Order : ");
//        tree.traversalInPostOrder();
//        System.out.println("\nPre Order : ");
//        tree.traversalInPreOrder();
//    }
//}
