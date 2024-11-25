import java.util.Arrays;

public class Lc_SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length-1){
            if(nums[i] == nums[i+1]){
                i+=3;
            }
            else {
                break;
            }
        }
        return nums[i];
    }
}
