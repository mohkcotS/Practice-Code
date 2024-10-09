import java.util.Arrays;

class Lc_HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int number = 1;
        for(int i = citations.length-1;i >= 0;i--){
            if(number <= citations[i] ){
                number++;
            }
            else {
                break;
            }
        }
        return number-1;
    }
}
