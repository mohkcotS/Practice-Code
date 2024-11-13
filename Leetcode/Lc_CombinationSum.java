import java.util.ArrayList;
import java.util.List;

public class Lc_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            generateCombination(0,current,candidates,result,target);
            return result;
        }
    public void generateCombination(int index, List<Integer> current, int[] candidates,List<List<Integer>> result,int target){
            int sum = sum(current);

            if(sum == target){
                result.add(new ArrayList<>(current));
                return;
            }
            if(sum > target || index == candidates.length){
                return;
            }
            current.add(candidates[index]);
            generateCombination(index,current,candidates,result,target);
            current.remove(current.size()-1);
            generateCombination(index+1,current,candidates,result,target);


    }
    public int sum(List<Integer> a){
        int sum = 0;
        for (Integer integer : a) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        Lc_CombinationSum p = new Lc_CombinationSum();
        int [] a = {2,3,6,7};
        System.out.println(p.combinationSum(a,7));
    }

}

