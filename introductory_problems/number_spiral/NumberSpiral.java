// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        Writer writer = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            String[] nums = input.nextLine().split(" ");
            findValue(Long.parseLong(nums[0]), Long.parseLong(nums[1]), writer);
        }
        writer.flush();
        input.close();
    }

    private static void findValue(long row, long col, Writer writer) throws IOException {
        if (row == col) {
            long res = row * (row - 1) + 1;
            writer.write(String.valueOf(res));
        } else {
            long max = Math.max(row, col);
            long middle = max * (max - 1) + 1;
            if (max % 2 == 0) {
                if (row < max) {
                    writer.write(String.valueOf(middle - max + row));
                } else {
                    writer.write(String.valueOf(middle + max - col));
                }
            } else {
                if (row < max) {
                    writer.write(String.valueOf(middle + max - row));
                } else {
                    writer.write(String.valueOf(middle - max + col));
                }
            }
        }
        writer.write('\n');
    }
}