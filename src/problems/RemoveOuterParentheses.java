package problems;

public class RemoveOuterParentheses {
    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(()()(()()))"));
    }

    public static String removeOuterParentheses(String S) {
        if("".equals(S)){
            return "";
        }
        StringBuilder result=new StringBuilder();
        char[] chars=S.toCharArray();
        int flag=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='('){
                flag++;
                if(flag!=1){
                    result.append(chars[i]);
                }
            }else {
                flag--;
                if(flag!=0){
                    result.append(chars[i]);
                }
            }
        }
        return result.toString();
    }
}
