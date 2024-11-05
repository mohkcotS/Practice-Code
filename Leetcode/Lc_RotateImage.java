import java.util.LinkedList;
import java.util.Queue;

public class RotateImage {
    public void rotate(int[][] matrix) {
        Queue<Integer> q = new LinkedList<>();
        int size = matrix.length;
        for(int i = 0;i<size;i++){
            for (int j = 0; j<size;j++){
                q.add(matrix[i][j]);
            }
        }
        for(int i = size-1;i>=0;i--){
            for (int j = 0; j<size;j++){
                matrix[i][j] = q.poll();
            }
        }
    }
}
