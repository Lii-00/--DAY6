/*
题目：#9
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/palindrome-number
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        if(x == 0)return true;
        int count = 0;
        int tmp = x;
        int[] sin_num = new int[10];
        while(tmp != 0){
            sin_num[count] = tmp % 10;
            count++;
            tmp /= 10;
        }
        int i = 0;
        int j = count - 1;
        for(; i < count / 2; i++){
            if(j <= i)break;
            if(sin_num[i] == sin_num[j]){
                j--;
            }else
                return false;
        }
        return true;
    }
}