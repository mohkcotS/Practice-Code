class Lc_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  row = matrix.length-1;
        int col = matrix[0].length-1;
        System.out.println(col + " " + row);

        if(matrix[0][0] > target || matrix[row][col] < target){
            return false;
        }
        int index = 0;
        for(int i = 0; i <= row;i++){
            if(target <= matrix[i][col]){
                index = i;
                break;
            }
        }

        for(int i = 0; i <= col;i++){
            if(target == matrix[index][i]){
                return true;
            }
        }
        return false;
    }
}