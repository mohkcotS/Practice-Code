import java.util.Arrays;
import java.util.Comparator;

class Lc_MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]); // Compare based on the first element
            }
        });
        int n = intervals.length;
        for(int i = 1; i<intervals.length;i++){
            if(intervals[i][0] <= intervals[i-1][1]){
                System.out.println(intervals[i][0] + " " + intervals[i-1][1]);
                intervals[i][0] = Math.min(intervals[i][0],intervals[i-1][0]);
                intervals[i][1] = Math.max(intervals[i][1],intervals[i-1][1]);
                intervals[i-1][1] = -1;
                intervals[i-1][0] = -1;
                n--;
            }
        }
        int [][] a = new int[n][2];
        int size = 0;
        for (int i = 0; i<intervals.length;i++ ){
            if(intervals[i][0] != -1){
                a[size][0] = intervals[i][0];
                a[size][1] = intervals[i][1];
                size++;
            }
        }

        return a;
    }

}