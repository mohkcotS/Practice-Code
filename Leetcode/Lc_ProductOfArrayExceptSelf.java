import java.util.Arrays;

public class Lc_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int count  = 0;
        boolean check = false;
        for (int num : nums) {
            if (num != 0) {
                mul *= num;
            } else {
                check = true;
                count++;
            }
        }

        if (check){
            if(count == 1){
                for (int i = 0 ;i < nums.length;i++){
                    if(nums[i] == 0){
                        nums[i] = mul;
                    }
                    else{
                        nums[i] = 0;
                    }
                }
            }
            else {
                Arrays.fill(nums,0);
            }
        }
        else {
            for (int i = 0 ;i < nums.length;i++){
                nums[i] = mul/nums[i];
            }
        }

        return  nums;
    }
}
