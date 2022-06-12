// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class BitStrings {
    private static long MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        Writer writer = new PrintWriter(System.out);
        long[] saved = new long[n + 1];
        saved[0] = 1;
        saved[1] = 2;
        long res = findNum(n, saved);
        writer.write(String.valueOf(res));
        writer.flush();
    }

    private static long findNum(int n, long[] saved){
        if (saved[n] != 0) return saved[n];
        else {
            if (n % 2 == 0) {
                long x = findNum(n / 2, saved);
                saved[n] = x * x % MOD;
                return saved[n];
            } else {
                long x = findNum(n / 2, saved);
                saved[n] = x * x * 2 % MOD;
                return saved[n]; 
            }
        }

    }


}