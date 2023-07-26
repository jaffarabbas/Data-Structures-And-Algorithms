
//Tree class
class Node{
    int key;
    Node left,right;
    public Node(int data){
        key = data;
        left = right = null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){
        root = null;
    }
}



public class implentation_1 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        //root node
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);


        System.out.println("root : "+tree.root.key);
        System.out.println("root se left : "+tree.root.left.key);
        System.out.println("root se right : "+tree.root.right.key);
    }
}
