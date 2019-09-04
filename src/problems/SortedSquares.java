package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedSquares {
    public static void main(String[] args) {


    }

    public static int[] sortedSquares(int[] A) {
        int[] result=new int[A.length];
        int left=0,right=A.length-1;
        for (int i = 0; right >= left; i++) {
            if(Math.abs(A[left])>Math.abs(A[right])){
                result[A.length-i-1]=A[left]*A[left];
                left++;
            }else {
                result[A.length - i - 1] = A[right]*A[right];
                right--;
            }
        }
        return result;
    }
}
