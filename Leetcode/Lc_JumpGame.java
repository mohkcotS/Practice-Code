class Lc_JumpGame {
    public boolean canJump(int[] nums) {
        int jump = 0;
        int index = 0;
        while (jump < nums.length){
            int max = 0;
            int num1 = index + 1;
            int num2 = index + nums[index];
            if(num2 >= nums.length-1){
                return  true;
            }

            for(int i = num1 ;i <=num2;i++){
                if(nums[i] >= max){
                    max = nums[i];
                    index = i;
                    jump = index;
                }
            }
            if(index + nums[index] < num2){
                jump = num2;
            }

            if(max == 0 && jump < nums.length-1){
                return false;
            }
            else if(max == 0 && jump >= nums.length-1){
                return  true;
            }
        }
        return  true;
    }
    
}
