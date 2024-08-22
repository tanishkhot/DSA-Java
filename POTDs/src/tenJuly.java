public class tenJuly {
//    public static int minOperations(String[] logs) {
//        int forward = 0;
//        int backward = 0;
//        for(int i = 0; i < logs.length; i++){
//            if(logs[i] == "../"){
//                backward++;
//            }
//            else if(logs[i] == "./"){
//            continue;
//            }
//            else{
//                forward++;
//            }
//        }
//        return forward-backward;
//    }

    public static void main(String[] args) {
        String[] input = {"d1/","d2/","../","d21/","./"};

        int ans = tenJuly.minOperations(input);
        System.out.println(ans);
    }
    public static int minOperations(String[] logs) {
//        int forward = 0;
//        int backward = 0;
//        for(int i = 0; i < logs.length; i++){
//            if(logs[i] == "../"){
//                backward++;
//            }
//            else if(logs[i] == "./"){
//
//            }
//            else{
//                forward++;
//            }
//        }
//        return forward-backward;
        int depth = 0; // This will represent the current directory depth
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (depth > 0) {
                    depth--; // Move one level up
                }
            } else if (!logs[i].equals("./")) {
                depth++; // Move one level down
            }
        }
        return depth;
    }
}
