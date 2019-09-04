package problems;

import java.util.ArrayList;
import java.util.List;

public class ShortestToChar {
    public static void main(String[] args) {
        System.out.println(0^3);
    }
    public int[] shortestToChar(String S, char C) {
        int[] result=new int[S.length()];
        int flag=0;
        List<Integer> list=new ArrayList<>();
        int index=S.indexOf(C);
        while (index>=0){
            list.add(index);
            index=S.indexOf(C,index+1);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i); j++) {
                result[flag++]=list.get(i)-j;
            }
        }
        return result;
    }
}
