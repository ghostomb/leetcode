package problems;

public class IsValid {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        char[] stack=new char[s.length()];
        int flag=0;
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(temp=='[' || temp=='{' || temp == '('){
                stack[flag++]=temp;
            }else if(temp==']'|| temp == ')' || temp=='}'){
                if(flag==0) return false;
                char y=stack[flag-1];
                if((temp==']' && y=='[') || (temp==')' && y=='(')|| (temp=='}' && y=='{')){
                    stack[--flag]=0;
                }else {
                    return false;
                }
            }
        }
        return flag==0;
    }
}
