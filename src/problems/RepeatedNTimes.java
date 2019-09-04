package problems;

import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes {
    public static void main(String[] args) {
        int[] a=new int []{
                5,1,5,2,5,3,5,4
        };
        System.out.println(repeatedNTimes(a));
    }
    public static int repeatedNTimes(int[] A) {
        Set<Integer> setResult=new HashSet<>();
        int i=0;
        while (setResult.add(A[i++]));
        System.out.println(setResult.toString());
        System.out.println(i);
        return A[i-1];
    }
}
