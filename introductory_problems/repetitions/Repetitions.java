import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        findLargest(s);
    }

    private static void findLargest(String s) {
        int cur = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
                max = Math.max(cur, max);
            } else {
                cur = 1;
            }
        }
        System.out.println(max);
    }
}
