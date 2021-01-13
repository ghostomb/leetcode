package problems.middle;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        permute(nums, path);
        return res;
    }

    void permute(int[] nums, List<Integer> path) {
        if(path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            permute(nums, path);
            path.remove(path.size() - 1);
        }
    }
}
