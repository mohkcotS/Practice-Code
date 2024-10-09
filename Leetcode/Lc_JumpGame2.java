class Lc_JumpGame2 {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        int goal = nums.length -1;
        int index =0 ;
        int turn = 0;
        boolean canFind = false;

        while (!canFind){
            for(int i = goal-1;i>=0;i--){
                System.out.println("Value: "+ nums[i] + " Index:" + i + " Goal: " + goal );
                if(nums[i] + i >= goal){
                    index = i;
                    if(index == 0){
                        canFind = true;
                    }
                }
            }
            goal = index;
            turn++;
        }
        return turn;
    }
}