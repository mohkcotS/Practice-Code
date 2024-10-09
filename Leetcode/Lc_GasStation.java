public class Lc_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int size = gas.length;
        int count = gas[size-1] - cost[size-1];
        int index = -1;
        boolean check = false;
        if(gas[size-1] >= cost[size-1] && (gas[0] - cost[0]) +(gas[size-1] - cost[size-1])>=0){
            index = size-1;
            check= true;
        }

        for(int i =0 ;i < size -1;i++){
            count = count + gas[i] - cost[i];
            if(gas[i] >= cost[i] && !check && ((gas[i+1]-cost[i+1]+(gas[i]-cost[i])) >=0)){
                index = i;
                check = true;
            }
            if(gas[i] < cost[i] && ((gas[i+1]-cost[i+1]+(gas[i]-cost[i])) <0 )){
                check = false;
            }

        }

        if(count >= 0){
            return index;
        }
        else {
            return -1;
        }

    }


}
