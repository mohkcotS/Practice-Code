class Lc_RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        int num = nums[0];
        for( int i = 1;i< nums.length;i++){
            if(nums[i] == num && count < 2){
                nums[index] = nums[i];
                num = nums[i];
                count++;
                index++;
            }
            else if (nums[i] != num){
                count = 1;
                nums[index] = nums[i];
                num = nums[i];
                index++;
            }
        }
        return index;
    }
}
