import java.util.Set;
/*

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        SetMatrixZeroes mat = new SetMatrixZeroes();
        mat.optimal();

    }

    //Fails for negative
    void brute(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {   // i Iterates over rows
            for (int j = 0; j < matrix[0].length; j++) {    // j Iterates over columns
                if(matrix[i][j] == 0){
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k] != 0 ) matrix[i][k] = -1;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j] != 0) matrix[k][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }


    void optimal(){
        System.out.println("Hey brother, you understand this.");
    }
}











