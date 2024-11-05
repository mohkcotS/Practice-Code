import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set <Integer> row = new HashSet<>();
        Set <Integer> col = new HashSet<>();
        int w = matrix[0].length;
        int h = matrix.length;

        for(int i = 0;i<h;i++){
            for (int j = 0; j<w;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i : row){
            System.out.println(i);
            for(int j = 0; j <w;j++){
                matrix[i][j] = 0;
            }
        }

        for (int i : col){
            for(int j = 0; j <h;j++){
                matrix[j][i] = 0;
            }
        }
    }

}
