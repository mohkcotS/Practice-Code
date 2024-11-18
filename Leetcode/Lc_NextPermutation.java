import java.util.Arrays;

public class Lc_NextPermutation {
    public void nextPermutation(int[] nums) {
        int f = -1, s =- 1;
        for(int i = nums.length - 2 ; i>=0;i--){
            if(nums[i] < nums[i+1]){
                f= i;
                break;
            }
        }

        if(f == -1){
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        for(int i = nums.length - 1; i>=0;i--){
            if(nums[i] > nums[f]){
                s= i;
                break;
            }
        }

        int t = nums[f];
        nums[f] = nums[s];
        nums[s] = t;

        if(f+1 <= s-1){
            Arrays.sort(nums,f+1,s-1);
        }
        System.out.println(Arrays.toString(nums));

    }

}
