import java.util.LinkedList;
import java.util.Scanner;

class test{
    LinkedList<Integer> list = new LinkedList<>();
    Scanner scn = new Scanner(System.in);
    public void Test(){
        while(true){
            System.out.println("Enter Your desire value in List \n1)Add in List\n2)Delete from Delete\n3)print from list");
            System.out.print("Enter : ");
            int itrater = scn.nextInt();
            switch (itrater) {
                case 1 -> {
                    System.out.print("Enter Number : ");
                    int num = scn.nextInt();
                    list.add(num);
                    System.out.println("Number Entered");
                }
                case 2 -> {
                    System.out.print("Enter Number : ");
                    int delete = scn.nextInt();
                    if(list.isEmpty()){
                        System.out.println("Empty");
                    }else {
                        list.remove(delete);
                    }
                    System.out.println("Number Delete");
                }
                case 3 ->{
                    if(!list.isEmpty()) {
                        System.out.println(list.toString());
                    }else{
                        System.out.println("List is Empty");
                    }
                }
                default -> System.out.println("Error!!");
            }
            if(itrater == 4){
                break;
            }
        }
    }
    public test(){
        Test();
    }
}

public class Question_1 {
    public static void main(String[] args) {
        test obj = new test();
    }
}
