import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        String[] nums = input.nextLine().split(" ");
        input.close();
        findLeastMove(n, nums);
    }

    private static void findLeastMove(int n, String[] nums) {
        long res = 0;
        int curMax = Integer.valueOf(nums[0]);
        for (int i = 1; i < n; i++) {
            int cur = Integer.valueOf(nums[i]);
            if (cur <= curMax) {
                res += (long)(curMax - cur);
            } else {
                curMax = cur;
            }
        }
        System.out.println(res);
    }
}
