import java.util.Stack;

public class BalancedParentheses{

    Stack<Character> stack = new Stack<>();
    public void balanceParentheses(String expression){
        int length = expression.length();


    if(length>1){
        for(char bracket: expression.toCharArray()){
            if(bracket =='{' || bracket =='(' || bracket == ']'){
                stack.push(bracket);
            } else if(bracket == '}' || bracket ==')' || bracket =='['){
                if(stack.isEmpty() || isItBalanced(stack.pop(),bracket)){
                    System.out.println("The expression is not balanced");
                    return;
                }   
                     } 
        }
        System.out.println("The expression is balanced");
    }
    else{
        System.out.println("The expression is too short.");
        return;
    }
    }
    public boolean isItBalanced(char open,char close){
        if(open== '{' && close =='}'){
            return true;

         } else if(open== '(' && close== ')'){
            return true;

         } else if(open == '[' && close==']'){
            return true;

         } 
          return false;
 }

}