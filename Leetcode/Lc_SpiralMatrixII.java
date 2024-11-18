public class Lc_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int [][] a = new int[n][n];
        int r = n;
        int l = 0;
        int b = n;
        int t = 0;
        int size = n*n;
        int i = 0;
        int j = 0;
        int count = 1;

        while (size >= 0 ){
            while (j <= r){
                a[i][j] = count;
                j++;
                size--;
                count++;
            }
            if(size == 0) {
                break;
            }
            j--;
            i++;


            while (i <= b){
                a[i][j] = count;
                i++;
                size--;
                count++;
            }
            if(size == 0) {
                break;
            }
            i--;
            j--;



            while (j >= l) {
                a[i][j] = count;
                j--;
                size--;
                count++;
            }
            if(size == 0) {
                break;
            }
            j++;
            i--;
            t++;

            while (i >= t) {
                a[i][j] = count;
                i--;
                size--;
                count++;
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
        return a;
}
}
