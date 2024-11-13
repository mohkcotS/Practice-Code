import java.util.Arrays;

public class Lc_ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3){
            return nums[0] +nums[1] + nums[2];
        }
        else{
            Arrays.sort(nums);
            int result  = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0;i < nums.length-2;i++){
                if (i > 0 && nums[i] == nums[i-1]){
                    continue;
                }
                int l = i+1;
                int r = nums.length-1;
                while (l < r){
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && r <= nums.length-2 && nums[r] == nums[r + 1]) {
                        r--;
                    }
                    int val = nums[i] + nums[l] + nums[r];

                    if(val == target){
                        return val;
                    }

                    if(Math.abs(target-val) < min){
                        min = Math.abs(target-val);
                        result = val;
                    }

                    if (val > target){
                        r--;
                    }
                    else {
                        l++;
                    }

                    }

                }
            return  result;
            }
    }
}
