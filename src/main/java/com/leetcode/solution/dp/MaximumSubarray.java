package com.leetcode.solution.dp;

public class MaximumSubarray {

    private static class Solution {
        public int maxSubArray(int[] nums) {
            int dp = nums[0];

            int ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp = Math.max(dp+ nums[i], nums[i]);
                ans = Math.max(ans, dp);
            }

            return ans;
        }
    }
}
