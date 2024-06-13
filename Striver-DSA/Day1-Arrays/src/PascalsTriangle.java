import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle p1 = new PascalsTriangle();
        p1.testArrayInsert();
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    innerList.add(1);
                } else {
                    int num = (outerList.get(i - 1).get(j) + outerList.get(i - 1).get(j - 1));
                    innerList.add(num);
                }

            }
            outerList.add(innerList);
        }
        return outerList;
    }

//        public void testArrayInsert () {
//            ArrayList<Integer> test = new ArrayList<Integer>();
//            test.add(1);
//            test.add(2);
//
//            for (int i = 0; i < test.size(); i++) {
//                System.out.println(test.get(i));
//            }
//        }

}
