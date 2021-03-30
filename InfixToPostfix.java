/**
 * Order of operation
 *  1) Parentheses e.g () {} []
 *  2) Exponents (right to left)
 *  3) multiplicatioin and division (left to right)
 *  4) Addition and Subtraction (left to right)
 * 
 */

public class InfixToPostfix {
    Stack stack;
    InfixToPostfix(){
        this.stack = null;
    }
    /* A + (B * C)*/
    boolean IsOpeningParentheses(char k){
        boolean value = false;
        if(k == '('){
            value = true;
        }else if(k == '{'){
            value = true;
        }else if(k == '['){
            value = true;
        }
        return value;
    }
    boolean HasHigherPrecidence(char op1, char op2){
        if(op1 == '*' && (op2 == '-' || op2 == '+')){
            return true;
        }else if(op1 == '/' && (op2 == '-' || op2 == '+')){
            return true;
        }else if(op1 == '+' && op2 == '-'){
            return true;
        }else if(op1 == '*' && op2 == '/'){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        System.out.println(infixToPostfix.IsOpeningParentheses('('));
        System.out.println(infixToPostfix.HasHigherPrecidence('*', '-'));
    }
}
