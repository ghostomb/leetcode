package problems;

public class DiStringMatch {
    public static void main(String[] args) {
        int[] rr=diStringMatch("DDI");
        for (int i = 0; i < rr.length; i++) {
            System.out.print(rr[i]);
        }


    }
    public static int[] diStringMatch(String S) {
        char[] ss=S.toCharArray();
        int[] result=new int[ss.length+1];
        int left=0,right=ss.length;
        for (int i = 0; i < ss.length; i++) {
            if(ss[i]=='I'){
                result[i]=left;
                left++;
            }else {
                result[i]=right;
                right--;
            }
        }
        result[ss.length]=left;
        return result;
    }
}
