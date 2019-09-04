package problems;

public class JudgeCircle {
    public static void main(String[] args) {
        System.out.println(judgeCircle("RRDD"));
    }
    public static boolean judgeCircle(String moves) {
        int cross=0,vertical=0;
        char[] steps=moves.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            if(steps[i]=='D'){
                vertical++;
            }else if(steps[i]=='U'){
                vertical--;
            }else if(steps[i]=='L'){
                cross++;
            }else if(steps[i]=='R'){
                cross--;
            }
        }
        return cross==0 &&vertical==0;
    }
}
