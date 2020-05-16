// https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1662/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int climbStairs(int n) {
        if(n < 3) return n;
        int prev1 = 1;
        int prev2 = 2;
        
        int num = 0;
        for(int i=3; i<=n; i++) {
            num = prev1+prev2;
            prev1 = prev2;
            prev2 = num;
        }
        
        return num;
    }
}
