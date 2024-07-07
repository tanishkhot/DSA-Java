public class sevenJuly {
    public static void main(String[] args) {
        sevenJuly obj1 = new sevenJuly();
        System.out.println(obj1.numWaterBottles(9,3));

    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int num = numBottles;
        int sum = 0;
        while(numBottles >= numExchange ){
            sum += numBottles / numExchange;
            numBottles = numBottles + (numBottles % numExchange);
        }
        return num + sum;
    }
}
