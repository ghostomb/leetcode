package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {

    }
    public int arrayPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length/2; i++) {
            max+=nums[i*2];
        }
        return max;
    }

}
