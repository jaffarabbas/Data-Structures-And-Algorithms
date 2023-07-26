import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ParenthesisMatch{
    //List type Function
    private List<String> resource;
    public List<String> removeParenthesis(String string){
        resource = new ArrayList();
        checkParan(string,0,0,new char[]{'(',')'});
        return resource;
    }
    private void checkParan(String string,int left,int right,char[] Parenthesis){
        int length = string.length();
        int value = 0;
        for(;right<length;right++){
            char character = string.charAt(right);
            if(character==Parenthesis[0]){
                value++;
            }else if(character == Parenthesis[1]){
                value--;
            }
            if(value < 0){
                break;
            }
        }
        if(value < 0){
            for(;left<=right;left++){
                char character = string.charAt(left);
                if(character!=Parenthesis[1]){
                    continue;
                }
                if(left > 1 && string.charAt(left) == string.charAt(left-1)){
                    continue;
                }
                String temp = string.substring(0,left)+string.substring(left+1);
                checkParan(temp,left,right,Parenthesis);
            }
        }else if (value > 0){
            checkParan(new StringBuilder(string).reverse().toString(),0,0,new char[]{')','('});
        }else{
            resource.add(Parenthesis[0]=='('?string:new StringBuilder(string).reverse().toString());
        }
    }
}
public class Question_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ParenthesisMatch obj = new ParenthesisMatch();
        String Parenthesis  = scn.next();
        System.out.println(obj.removeParenthesis(Parenthesis));
    }
}
