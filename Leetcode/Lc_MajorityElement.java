import java.util.HashMap;
import java.util.Map;
class Lc_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int v = hm.get(nums[i]).intValue() + 1;
                hm.put(nums[i],v);
            }
            else{
            hm.put(nums[i],1);
            }
        }

        int count = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > count){
                count = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

}