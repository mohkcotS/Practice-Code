import java.util.LinkedList;
import java.util.Queue;

class Lc_RotateArray {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = nums.length-1;i>=0;i--){
            q.add(nums[i]);
        }
        for (int i = 1 ; i<=k;i++){
            int num = q.poll();
            q.add(num);
        }
        int index = nums.length - 1;
        for(Integer i : q){
            nums[index] = i;
            index--;
        }

    }
}
