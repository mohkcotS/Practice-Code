class Lc_SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target;
        }

        int i;
        if(target >= nums[0]){
            i = 0;
            while (i <= nums.length - 1 && target >= nums[i]){
                if(target == nums[i]){
                    return true;
                }
                i++;
            }
        }

        else {
            i = nums.length - 1;
            while (i >=0 && target <= nums[i] ){
                if(target == nums[i]){
                    return true;
                }
                i--;
            }
        }
        return false;
    }
}