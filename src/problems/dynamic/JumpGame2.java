package problems.dynamic;

public class JumpGame2 {
    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
        int len = nums.length;
        int max = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == end) {
                end = max;
                step++;
            }
        }
        return step;
    }
}
