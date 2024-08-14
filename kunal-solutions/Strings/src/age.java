import javax.print.DocFlavor;

public class age {
    public static void main(String[] args) {
        String[] data = {"7868190130M7522"};
        int age = countSeniors(data);
        System.out.println(age);
    }
    public static int countSeniors(String[] details) {
        int age = 0;
        int char1 = 0;
        int char2 = 0;
        int count = 0;
        for(String detail: details){
            char[] arr = detail.toCharArray();
            age = 0;
            char1 = arr[11] - '0';
            char2 = arr[12] - '0';
            age += char1*10 + char2;
            if(age >= 60){
                count++;
            }
        }
        return age;

    }
}
