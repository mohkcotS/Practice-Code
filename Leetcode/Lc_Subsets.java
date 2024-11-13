import java.util.ArrayList;
import java.util.List;

public class Lc_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsets(0,current,nums,result);
        return result;
    }
    public void generateSubsets(int index, List<Integer> current, int[] nums,List<List<Integer>> result ){
        result.add(new ArrayList<>(current));
        for(int i = index;i<nums.length;i++){
            current.add(nums[i] );
            generateSubsets(i+1,current,nums,result);
            current.remove(current.size()-1);
        }
    }
}
