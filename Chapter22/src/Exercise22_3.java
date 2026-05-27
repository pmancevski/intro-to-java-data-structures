public class Exercise22_3 {
    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = "come";

        int startIndex = 0;
        int innerCount = 0;

        for (int count = 0; count <= s1.length() - s2.length(); count++) {
            startIndex = count;
            for (innerCount = 0; innerCount < s2.length(); innerCount++) {
                if (s1.charAt(count + innerCount) != s2.charAt(innerCount)) {
                    break;
                }
            }

            if (innerCount == s2.length()) {
                break;
            }
        }

        System.out.println("matched at index " + startIndex);
    }

}
