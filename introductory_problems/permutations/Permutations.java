// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        availablePermutation(n);
    }

    private static void availablePermutation(int n) throws IOException {
        String NO_SOLUTION = "NO SOLUTION";
        if (n == 1) {
            System.out.println(1);
        }
        else if (n <= 3 && n > 1) {
            System.out.println(NO_SOLUTION);
        }
        else {
            Writer writer = new PrintWriter(System.out);

            for (int i = 2; i <= n; i += 2) {
                writer.write(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                writer.write(i + " ");
            }
            writer.flush();
        }
    }
}