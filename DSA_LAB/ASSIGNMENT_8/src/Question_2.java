import java.util.LinkedList;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Delete All duplicate Values");
        int temp =0,count=0;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        for(Integer element: list)
        {
            if(!list2.contains(element))
                list2.add(element);
        }
        System.out.println("After Deletion : ");
        System.out.println(list2.toString());
    }
}
