// Working program using BufferedReader
import java.io.*;
import java.util.*;

public class TwoSets {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        findSets(n);
    }

    private static void findSets(int n) throws IOException {
        Writer writer = new PrintWriter(System.out);
        int mod = n % 4;
        if (mod == 1 || mod == 2) {
            writer.write("NO");
        } else {
            writer.write("YES" + '\n');
            if (mod == 0) {
                StringBuffer left = new StringBuffer();
                StringBuffer right = new StringBuffer();
                for (int i = 0; i < n; i += 4) {
                    left.append(String.valueOf(i + 1) + " ");
                    left.append(String.valueOf(i + 4) + " ");
                    right.append(String.valueOf(i + 2) + " ");
                    right.append(String.valueOf(i + 3) + " ");
                } 
                writer.write(String.valueOf(n/2) + '\n');
                writer.write(left.toString() + '\n');
                writer.write(String.valueOf(n/2) + '\n');
                writer.write(right.toString() + '\n');                

            } else {
                StringBuffer left = new StringBuffer("1 2 ");
                StringBuffer right = new StringBuffer("3 ");
                for (int i = 3; i < n; i += 4) {
                    left.append(String.valueOf(i + 1) + " ");
                    left.append(String.valueOf(i + 4) + " ");
                    right.append(String.valueOf(i + 2) + " ");
                    right.append(String.valueOf(i + 3) + " ");
                }
                writer.write(String.valueOf(n/2 + 1) + '\n');
                writer.write(left.toString() + '\n');
                writer.write(String.valueOf(n/2) + '\n');
                writer.write(right.toString() + '\n');      
            }
        }
        writer.flush();
    }
}