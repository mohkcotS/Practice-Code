public class Lc_TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int []a = new int[2];
        int l = 0;
        int r = numbers.length-1;
        while (l < r){
            while (numbers[l] + numbers[r] > target ){
                r--;
            }

            if(numbers[l] + numbers[r] != target){
                l++;
            }

            if(numbers[l] + numbers[r] == target){
                break;
            }
        }
        a[0] = l+1;
        a[1] = r+1;
        return a;
    }

}
