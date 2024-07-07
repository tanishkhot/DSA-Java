import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        traverse(matrix, 0, matrix.length -1, 0, matrix[0].length -1, ans);
        return ans;
    }

    static void traverse(int[][] matrix, int top, int bottom, int left, int right, List<Integer> result){
        if(top > bottom || left > right){
            return;
        }

        for(int i = left; i <= right; i++){
            result.add(matrix[top][i]);
        }
        top++;
        for(int i = top; i<= bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;

        if(top <= bottom){
            for (int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if(left <= right){
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        traverse(matrix, top, bottom, left, right, result);
    }
}
