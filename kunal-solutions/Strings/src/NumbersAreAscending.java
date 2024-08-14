public class NumbersAreAscending {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }
    public static boolean areNumbersAscending(String s) {
        int prevNumber = -1;
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < n && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                int currentNumber = Integer.parseInt(s.substring(i, j));
                if (currentNumber <= prevNumber) {
                    return false;
                }
                prevNumber = currentNumber;
                i = j;
            } else {
                i++;
            }
        }
        return true;
    }
}
