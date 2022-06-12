// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        Writer writer = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            String[] nums = input.nextLine().split(" ");
            boolean res = findValue(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
            if (res)  {
                writer.write("YES\n");
            } else {
                writer.write("NO\n");
            }
        }
        input.close();
        writer.flush();
    }

    private static boolean findValue(int left, int right) {
        if (left > right) {
            return findValue(right, left);
        } 
        int diff = right - left;
        if (diff > left) return false;
        return (left - diff) % 3 == 0;
    }
}