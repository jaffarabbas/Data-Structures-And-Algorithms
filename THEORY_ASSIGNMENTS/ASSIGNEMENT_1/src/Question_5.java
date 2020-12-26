import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> res;
    public List<String> removeInvalidParentheses(String s) {
        res=new ArrayList();
        recur(s,0,0,new char[]{'(',')'});
        return res;
    }
    private void recur(String s,int left,int right,char[] paranthesis){
        int len=s.length();int val=0;
        for(;right<len;right++){
            char ch=s.charAt(right);
            if(ch==paranthesis[0]) val++;
            else if(ch==paranthesis[1]) val--;
            if(val<0) break;
        }
        if(val<0){
            for(;left<=right;left++){
                char ch=s.charAt(left);
                if(ch!=paranthesis[1]) continue;
                if(left>1 && s.charAt(left)==s.charAt(left-1)) continue;
                String temp=s.substring(0,left)+s.substring(left+1);
                recur(temp,left,right,paranthesis);
            }
        }
        else if(val>0){
            recur(new StringBuilder(s).reverse().toString(),0,0,new char[]{')','('});
        }
        else res.add(paranthesis[0]=='('?s:new StringBuilder(s).reverse().toString());
    }
}


public class Question_5 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.removeInvalidParentheses("()(()"));
    }
}
