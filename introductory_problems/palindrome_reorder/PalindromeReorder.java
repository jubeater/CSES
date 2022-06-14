// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String source = input.nextLine();
        input.close();
        Writer writer = new PrintWriter(System.out);
        String res = findPalindrome(source);
        writer.write(res);
        writer.flush();
    }

    private static String findPalindrome(String source){
        int[] counts = new int[26];
        int num_odd = 0;
        for (int i = 0; i < source.length(); i++) {
            char cur = source.charAt(i);
            int idx = (int)(cur - 'A');
            counts[idx]++;
            if (counts[idx] % 2 == 0) {
                num_odd--;
            } else {
                num_odd++;
            }
        }
        if (num_odd > 1) {
            return "NO SOLUTION";
        } else {
            int oddIdx = -1;
            if (num_odd == 1) {
                for (int i = 0; i < 26; i++) {
                    if (counts[i] % 2 == 1) {
                        oddIdx = i;
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                int curCount = counts[i] / 2;
                for (int j = 0; j < curCount; j++) {
                    sb.append((char)(i + 'A'));
                }
            }
            if (oddIdx != -1) {
                return sb.toString() + Character.toString((char)('A' + oddIdx)) + sb.reverse().toString();
            } else {
                return sb.toString() + sb.reverse().toString();
            }
        }
    }


}