// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class TwoKnights {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        findNum(n);
    }

    private static void findNum(int n) throws IOException {
        int[] source = new int[]{0, 6, 28};
        Writer writer = new PrintWriter(System.out);
        if (n <= 3) {
            for (int i = 0; i < n; i++) {
                writer.write(String.valueOf(source[i]) + '\n');
            }
        }
        else {
            for (int i : source) {
                writer.write(String.valueOf(i) + '\n');
            }
            for (int i = 4; i <= n; i++) {
                writer.write(getRes(i) + '\n');
            }
        }
        writer.flush();
    }

    private static String getRes(int n) {
        long input = (long)n;
        long res = (input - 1) * (input + 4) * (input * input - 3 * input + 4) / 2;
        return String.valueOf(res);
    }
}