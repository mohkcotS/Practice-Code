class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1 && nums[0] < target ){
            return 0;
        }
        else if (nums[0] >= target){
            return 1;
        }

        int min = 999999999;
        int l = 0;
        int r = 1;
        int sum = nums[0] + nums[1];
        while (r <= nums.length- 1){
            if(min == 1){
                return  min;
            }
            if(sum >= target ){
                int temp = r-l+1;
                if(temp > 0 && temp < min){
                    min = temp;
                }
                sum -= nums[l];
                l++;
            }
            else {
                r++;
                if(r == nums.length){
                    break;
                }
                sum+= nums[r];
            }
        }
        if(min == 999999999){
            return 0;
        }
        return  min;
    }
}
