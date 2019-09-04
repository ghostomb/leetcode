package problems;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{2,1,2,1,1,2,2,1}));
    }
//    public static int heightChecker(int[] heights) {
//        int move=0;
//        if(heights.length<=2){
//            return 0;
//        }
//        for (int i = 0; i < heights.length-1; i++) {
//            if(i==0){
//                if(heights[i]>heights[i+1]){
//                    move++;
//                }
//                continue;
//            }else if(i< (heights.length-1)) {
//                if(heights[i]>heights[i+1] && heights[i] >heights[i-1] || heights[i]<heights[i+1] && heights[i] <heights[i-1]){
//                    move++;
//                }
//                continue;
//            }else if(i==(heights.length-1)) {
//                if(heights[i]>heights[i+1]){
//                    move++;
//                }
//                continue;
//            }
//        }
//        return move;
//    }
        public static int heightChecker(int[] heights) {
            int move=0;
            int[] temp=new int[heights.length];
            for (int i = 0; i < heights.length ; i++) {
                temp[i]=heights[i];
            }
            Arrays.sort(temp);
            for (int i = 0; i < heights.length; i++) {
                if(temp[i]!=heights[i]){
                    move++;
                }
            }
            return move;
        }
}
