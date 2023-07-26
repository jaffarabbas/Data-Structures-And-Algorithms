import java.util.*;

class Infix1{
    Scanner scn = new Scanner(System.in);
    String charInString;
    char[] character;
    public Infix1(){
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

class Prefix1{
    public Prefix1(){

    }
}

class PostFix1{
    Infix1 in = new Infix1();
    int count =0 ;
    Stack<Character> stack = new Stack<>();
    char[] Output = new char[in.character.length];
    int i=0,j=0;
    public void insertInStack(char[] arr){
        while(arr[i]!='\0'){
            if(isOperater(arr[i]) != 3 && isOperater(arr[i]) != 2){
                Output[i] = arr[i];
                j++;
                i++;
            }else if(precedence(arr[i]) > precedence(stack.peek())){
                stack.push(arr[i]);
                i++;
            }else{
                Output[j] = stack.pop();
                j++;
            }
        }
        while(!stack.isEmpty()){
            Output[j] = stack.pop();
            j++;
        }
    }
    int precedence(char temp){
        if(temp == '+' || temp == '-' || temp =='*' || temp =='/' || temp == '^' ||  temp == '~'){
            return 1;
        }else{
            return 0;
        }
    }
    int isOperater(char temp){
        if(temp =='*' || temp == '/'){
            return 3;
        }else if(temp =='+' || temp == '-'){
            return 2;
        }else{
            return 0;
        }
    }
    public PostFix1(){
        insertInStack(in.character);
        for(char n: in.character){
            System.out.print(n);
        }
        System.out.println();
        System.out.println("");
        System.out.println(stack);
        for(char n:Output){
            System.out.print(n);
        }
    }
}

class Test1{
    public Test1(){
        PostFix1 o  =new PostFix1();
    }
}
public class imp2 {
    public static void main(String[] args) {
        Test1 object = new Test1();
    }
}