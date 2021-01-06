package problems.middle;

import java.util.Arrays;

public class LongestIncreasingSubsequence_300 {

    public static void main(String[] args) {
        int[] a = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(new LongestIncreasingSubsequence_300().lengthOfLIS(a));
        System.out.println(new LongestIncreasingSubsequence_300().lengthOfLIS(new int[]{0}));
    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int lengthOfLIS2(int[] nums) {
        //二分查找
        int[] top = new int[nums.length];

        int groups = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int left = 0, right = groups;
            while (left < right) {
                int mid = (left + right) /2 ;
                if (top[mid] >= num) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == groups) {
                groups++;
            }
            top[left] = num;
        }
        return groups;
    }
}
