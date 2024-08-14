public class Learning {
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "World";

            // Concatenation
            String s3 = s1 + " " + s2;
            System.out.println(s3); // "Hello World"

            // Length
            System.out.println(s1.length()); // 5

            // Character Access
            System.out.println(s1.charAt(0)); // 'H'

            // Substring
            System.out.println(s1.substring(1, 4)); // "ell"

            // Comparison
            System.out.println(s1.equals(s2)); // false
            System.out.println(s1.equalsIgnoreCase("hello")); // true
            System.out.println(s1.compareTo(s2)); // Negative value

            // Searching
            System.out.println(s1.indexOf('e')); // 1
            System.out.println(s1.contains("ell")); // true

            // Replacing
            System.out.println(s1.replace('e', 'a')); // "Hallo"

            // Case Conversion
            System.out.println(s1.toUpperCase()); // "HELLO"

            // Trimming
            System.out.println("  Hello  ".trim()); // "Hello"

            // Splitting
            String[] parts = "one,two,three".split(",");
            for (String part : parts) {
                System.out.println(part);
            }

            // Using StringBuilder
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println(sb.toString()); // "Hello World"
        }
}
