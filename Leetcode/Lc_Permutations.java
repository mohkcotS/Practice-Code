import java.util.ArrayList;
import java.util.List;

public class Lc_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int[] use = new int[nums.length];
        generatePermutations(current, nums, result, use);
        return result;
    }

    private void generatePermutations(List<Integer> current, int[] nums, List<List<Integer>> result, int[] use) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (use[i] == 0) {
                use[i] = 1;
                current.add(nums[i]);
                generatePermutations(current, nums, result, use);
                current.remove(current.size() - 1);
                use[i] = 0;
            }
        }
    }
}
