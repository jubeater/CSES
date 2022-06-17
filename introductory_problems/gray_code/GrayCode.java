import java.io.*;
import java.util.*;

public class GrayCode {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextInt());
        input.close();
        Writer writer = new PrintWriter(System.out);
        int max = 1;
        for (int i = 0; i < n; i++) {
            max = max << 1;
        }
        for (int i = 0; i < max; i++) {
            String res = numToGray(i, n);
            writer.write(res + '\n');
        }
        writer.flush();
    }

    private static String numToGray(int curVal, int bits){
        int res = curVal ^ (curVal >> 1);
        char[] target = new char[bits];
        Arrays.fill(target, '0');
        String resStr = Integer.toBinaryString(res);
        for (int i = 0; i < resStr.length(); i++) {
            target[target.length - 1 - i] = resStr.charAt(resStr.length() - 1 - i);
        }
        return new String(target);
    }


}