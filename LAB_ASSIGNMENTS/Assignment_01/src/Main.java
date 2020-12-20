import java.util.*;

class Infix{
   
}

class Prefix{
    Infix in = new Infix();
    Stack<Character> stack = new Stack<>();
    char[] ReverseCharacter = new char[character.length];
    char[] Output = new char[character.length];
    char[] ReversePostfix = new char[character.length];
    //for reverse the string
    public void ReverseString(){
        int j = character.length;
        for (int i = 0; i < character.length; i++) {
            ReverseCharacter[j - 1] = character[i];
            j = j - 1;
        }
        for (int i = 0; i < character.length; i++) {
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
        for (int k = 0; k < character.length; k++) {
            System.out.print(character[k]);
        }
        insertInStack();
        System.out.println("");
        System.out.println("Prefix : ");
        for(char n:ReversePostfix){
            System.out.print(n);
        }
    }
}

// class PostFix{
//     Infix in = new Infix();
//     int count =0 ;
//     Stack<Character> stack = new Stack<>();
//     char[] Output = new char[character.length];
//     public void insertInStack(){
//         for (int i = 0;i<character.length;++i){
//             if(character[i] == '(' || character[i] == '+' || character[i] == '-' || character[i] == '/'
//                     || character[i] == '*' || character[i] == '^' ||  character[i] == '~'){
//                 stack.push(character[i]);
//             }else if(character[i] >='a' && character[i] <='z' || character[i] >='A' && character[i] <='Z'){
//                 Output[i] = character[i];
//             }else if(character[i] == ')'){
//                 while(!stack.isEmpty() && stack.peek()!='('){
//                     char temp = stack.pop();
//                     if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
//                         Output[i] = temp;
//                     }
//                 }
//             }
//         }
//         //remaining operaters at end
//         while (!stack.isEmpty()){
//             char temp = stack.pop();
//             if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
//                 Output[character.length-1] = temp;
//             }
//         }
//     }
//     public PostFix(){
//         insertInStack();
        
//     }
// }
public class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String charInString;
    char[] character;
        System.out.println("Enter String");
        charInString = scn.next();
        character = new char[charInString.length()];
        for(int i = 0;i<charInString.length();++i){
            character[i] = charInString.charAt(i);
        }
     

        Stack<Character> stack = new Stack<>();
        char[] Output = new char[character.length];
        for (int i = 0;i<character.length;++i){
            if(character[i] == '(' || character[i] == '+' || character[i] == '-' || character[i] == '/'
                    || character[i] == '*' || character[i] == '^' ||  character[i] == '~'){
                stack.push(character[i]);
            }else if(character[i] >='a' && character[i] <='z' || character[i] >='A' && character[i] <='Z'){
                Output[i] = character[i];
            }else if(character[i] == ')'){
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
                Output[character.length-1] = temp;
            }
        }

        System.out.println("Infix is : ");
        for(char n: character){
            System.out.print(n);
        }
        System.out.println("\nPostfix : ");
        for(char n:Output){
            System.out.print(n);
        }

        //prefix

        Stack<Character> stack = new Stack<>();
        char[] ReverseCharacter = new char[character.length];
        char[] Output1 = new char[character.length];
        char[] ReversePostfix = new char[character.length];
        //for reverse the string
        public void ReverseString(){
            int j = character.length;
            for (int i = 0; i < character.length; i++) {
                ReverseCharacter[j - 1] = character[i];
                j = j - 1;
            }
            for (int i = 0; i < character.length; i++) {
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
                    Output1[i] = ReverseCharacter[i];
                }else if(ReverseCharacter[i] == ')'){
                    while(!stack.isEmpty() && stack.peek()!='('){
                        char temp = stack.pop();
                        if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                            Output1[i] = temp;
                        }
                    }
                }
            }
            //remaining operaters at end
            while (!stack.isEmpty()){
                char temp = stack.pop();
                if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
                    Output1[ReverseCharacter.length-1] = temp;
                }
            }
            ReversePostFix();
        }
        //Reverse of postFix
        public void ReversePostFix(){
            int j = Output1.length;
            for (int i = 0; i < ReverseCharacter.length; i++) {
                ReversePostfix[j - 1] = Output[i];
                j = j - 1;
            }
        }
    

            System.out.println("Infix is: ");
            for (int k = 0; k < character.length; k++) {
                System.out.print(character[k]);
            }
            System.out.println("");
            System.out.println("Prefix : ");
            for(char n:ReversePostfix){
                System.out.print(n);
            }
    }
}
