import java.util.*;

class Infix{
    Scanner scn = new Scanner(System.in);
    String charInString;
    char[] character;
    public Infix(){
        prepareCharacter();
    }
    public void prepareCharacter(){
        System.out.println("Enter String");
        charInString = scn.next();
        character = new char[charInString.length()];
        for(int i = 0;i<charInString.length();++i){
            character[i] = charInString.charAt(i);
        }
    }
}

class Prefix{
    Infix in = new Infix();
    Stack<Character> stack = new Stack<>();
    char[] ReverseCharacter = new char[in.character.length];
    char[] Output = new char[in.character.length];
    char[] ReversePostfix = new char[in.character.length];
    //for reverse the string
    public void ReverseString(){
        int j = in.character.length;
        for (int i = 0; i < in.character.length; i++) {
            ReverseCharacter[j - 1] = in.character[i];
            j = j - 1;
        }
        for (int i = 0; i < in.character.length; i++) {
            if(ReverseCharacter[i] == '('){
                ReverseCharacter[i] = ')';
            }else if(ReverseCharacter[i] == ')'){
                ReverseCharacter[i] = '(';
            }
        }
    }
    //postfix of reverse
    public void insertInStack(){
        for (int i = 0;i<ReverseCharacter.length;++i){
            if(ReverseCharacter[i] == '(' ||ReverseCharacter[i] == '+' || ReverseCharacter[i] == '-' || ReverseCharacter[i] == '/'
                    || ReverseCharacter[i] == '*' || ReverseCharacter[i] == '^' ||  ReverseCharacter[i] == '~'){
                stack.push(ReverseCharacter[i]);
            }else if(ReverseCharacter[i] >='a' && ReverseCharacter[i] <='z' || ReverseCharacter[i] >='A' && ReverseCharacter[i] <='Z'){
                Output[i] = ReverseCharacter[i];
            }else if(ReverseCharacter[i] == ')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    char temp = stack.pop();
                    if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                        Output[i] = temp;
                    }
                }
            }
        }
        //remaining operaters at end
        while (!stack.isEmpty()){
            char temp = stack.pop();
            if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                Output[ReverseCharacter.length-1] = temp;
            }
        }
        ReversePostFix();
    }
    //Reverse of postFix
    public void ReversePostFix(){
        int j = Output.length;
        for (int i = 0; i < ReverseCharacter.length; i++) {
            ReversePostfix[j - 1] = Output[i];
            j = j - 1;
        }
    }

    public Prefix(){
        ReverseString();
        System.out.println("Infix is: ");
        for (int k = 0; k < in.character.length; k++) {
            System.out.print(in.character[k]);
        }
        insertInStack();
        System.out.println("");
        System.out.println("Prefix : ");
        for(char n:ReversePostfix){
            System.out.print(n);
        }
    }
}

class PostFix{
    Infix in = new Infix();
    int count =0 ;
    Stack<Character> stack = new Stack<>();
    char[] Output = new char[in.character.length];
    public void insertInStack(){
        for (int i = 0;i<in.character.length;++i){
            if(in.character[i] == '(' || in.character[i] == '+' || in.character[i] == '-' || in.character[i] == '/'
                    || in.character[i] == '*' || in.character[i] == '^' ||  in.character[i] == '~'){
                stack.push(in.character[i]);
            }else if(in.character[i] >='a' && in.character[i] <='z' || in.character[i] >='A' && in.character[i] <='Z'){
                Output[i] = in.character[i];
            }else if(in.character[i] == ')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    char temp = stack.pop();
                    if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                        Output[i] = temp;
                    }
                }
            }
        }
        //remaining operaters at end
        while (!stack.isEmpty()){
            char temp = stack.pop();
            if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                Output[in.character.length-1] = temp;
            }
        }
    }
    public PostFix(){
        insertInStack();
        System.out.println("Infix is : ");
        for(char n: in.character){
            System.out.print(n);
        }
        System.out.println("\nPostfix : ");
        for(char n:Output){
            System.out.print(n);
        }
    }
}

class Test{
    public Test(){
        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.println("\n1)Prefix\n2)Postfix");
            System.out.print("Enter : ");
            int itrater = scn.nextInt();
            switch (itrater){
                case 1:
                    Prefix o2 = new Prefix();
                    break;
                case 2:
                    PostFix o  =new PostFix();
                    break;
                default:
                    System.out.println("Error choose between 1 and 2");
                    break;
            }
            if(itrater == 0){
                break;
            }
        }
    }
}
public class Implementation {
    public static void main(String[] args) {
        Test object = new Test();
    }
}
