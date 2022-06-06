import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        String[] nums = input.nextLine().split(" ");
        input.close();
        findMissingNumber(n, nums);
    }

    private static void findMissingNumber(int n, String[] nums) {
        int start = 0;
        for (int i = 1; i <= n; i++) {
            start = (int)(start ^ i);
        }
        for (String num : nums) {
            int int_num = Integer.valueOf(num);
            start = (int)(start ^ int_num);
        }
        System.out.println(start);
    }
}