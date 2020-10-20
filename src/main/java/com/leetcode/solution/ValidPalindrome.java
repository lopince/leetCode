package com.leetcode.solution;

public class ValidPalindrome {

    private static class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return true;
            }

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                while (left < right && !(Character.isDigit(s.charAt(left)) || Character.isLetter(s.charAt(left)))) {
                    left++;
                }

                while (left < right && !(Character.isDigit(s.charAt(right)) || Character.isLetter(s.charAt(right)))) {
                    right--;
                }

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

}
