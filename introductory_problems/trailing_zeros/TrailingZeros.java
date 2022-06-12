// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class TrailingZeros {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        Writer writer = new PrintWriter(System.out);
        int res = findFives(n);
        writer.write(String.valueOf(res));
        writer.flush();
    }

    private static int findFives(int n){
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }


}