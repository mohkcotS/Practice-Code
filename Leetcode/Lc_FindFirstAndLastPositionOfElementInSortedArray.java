public class Lc_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int [] a = new int[2];
        a[0] = -1;
        a[1] = -1;
        if(nums.length == 1){
            return a;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r){
            if(nums[l] < target){
                l++;
            }
            if(nums[r] > target){
                r--;
            }
            if(nums[r] <= target && nums[l] >= target){
                break;
            }
        }
        if(nums[l] == target && nums[r] == target){
            a[0] = l;
            a[1] = r;
        }
        return a;
    }
}
