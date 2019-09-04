package problems.second;


public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    public static String reverseOnlyLetters(String S) {
        int start=0,end=S.length()-1;
        char[] chars=S.toCharArray();
        char[] result=new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if((chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122)){
                while (chars[end]<65||(chars[end]>90&&chars[end]<97||chars[end]>122)){
                    end--;
                }
                result[i]=chars[end--];
            }else {
                result[i]=chars[i];
            }
        }
        return new String(result);
    }
}
