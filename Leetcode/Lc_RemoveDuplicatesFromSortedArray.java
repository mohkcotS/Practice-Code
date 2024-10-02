class Lc_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int before = nums[0];
        for(int i =1; i<nums.length;i++){
            if(nums[i] != before){
                nums[index] = nums[i];
                index++;
                before = nums[i];
            }
        }
        return index-1;
    }
}