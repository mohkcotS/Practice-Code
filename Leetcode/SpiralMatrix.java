import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = matrix[0].length-1;
        int l = 0;
        int b = matrix.length-1;
        int t = 0;
        int size = matrix[0].length * matrix.length;
        int i = 0;
        int j = 0;

        while (size >= 0){
            while (j <= r){
                list.add(matrix[i][j]);
                j++;
                size--;
            }
            if(size == 0) {
                break;
            }
            j--;
            i++;


            while (i <= b){
                list.add(matrix[i][j]);
                i++;
                size--;
            }
            if(size == 0) {
                break;
            }
            i--;
            j--;



            while (j >= l) {
                list.add(matrix[i][j]);
                j--;
                size--;
            }
            if(size == 0) {
                break;
            }
            j++;
            i--;
            t++;

            while (i >= t) {
                list.add(matrix[i][j]);
                i--;
                size--;
            }
            if(size == 0) {
                break;
            }
            i++;
            j++;
            b--;
            l++;
            r--;

        }

        return list;
    }


}
