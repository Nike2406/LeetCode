package twoSum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                 return new int[] {i, j};
                }
            }
        }
        return null;
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(solution.twoSum(arr, -8)));
    }
}
