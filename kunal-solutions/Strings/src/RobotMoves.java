public class RobotMoves {
    public boolean judgeCircle(String moves) {
        int[] arr = {0,0};
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                arr[0] += 1;
            }
            if(moves.charAt(i) == 'D'){
                arr[0] -= 1;
            }
            if(moves.charAt(i) == 'R'){
                arr[1] += 1;
            }
            if(moves.charAt(i) == 'L'){
                arr[1] -= 1;
            }

        }
        if(arr[0] == 0 && arr[1] == 0){
            return true;
        }
        return false;
    }
}
