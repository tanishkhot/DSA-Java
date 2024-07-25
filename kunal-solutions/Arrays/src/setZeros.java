import java.util.ArrayList;

public class setZeros {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
    }



    public static void setZeroes(int[][] matrix) {
        boolean[][] boolMat = new boolean[matrix.length][matrix[0].length];
        for(int i =0 ; i < boolMat.length; i++){
            for (int j = 0; j < boolMat[0].length; j++) {
                boolMat[i][j] = false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {   // i Iterates over rows
            for (int j = 0; j < matrix[0].length; j++) {    // j Iterates over columns
                if(matrix[i][j] == 0){
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k] != 0 ) boolMat[i][k] = true;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j] != 0) boolMat[k][j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(boolMat[i][j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void setZeroes2(int[][] matrix) {
        ArrayList<Position> zeros = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeros.add(new Position(i ,j));
                }
            }
        }
        for(int i = 0; i < zeros.size(); i++){
            Position temp  = zeros.get(i);
            temp.makeRowZero(matrix[temp.row]);
            temp.makeColZero(matrix, temp.col);
            zeros.remove(i);
        }

    }


}

class Position{
    int row; int col;
    public void makeRowZero(int[] row){
        for(int i = 0; i < row.length; i++){
            row[i] = 0;
        }
    }
    public void makeColZero(int[][] matrix, int col){
        for(int i = 0 ; i < matrix.length; i++){
            matrix[col][i] = 0;
        }
    }
    Position(int i, int j){
        this.row = i;
        this.col = j;
    }
}