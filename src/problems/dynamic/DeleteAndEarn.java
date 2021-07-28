package problems.dynamic;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 2};
        System.out.println(new DeleteAndEarn().deleteAndEarn(nums));
    }

    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] all = new int[max + 1];
        for (int item : nums ) {
            all[item] ++ ;
        }

        int prev = all[1] * 1;
        int curr = Math.max(prev,  all[2]*2);
        int temp = 0;
        for (int i = 3; i <= max ; i++) {
            temp = Math.max(curr, prev + i * all[i]);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
