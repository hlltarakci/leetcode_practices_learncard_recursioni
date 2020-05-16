// https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1661/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int fib(int N) {
        if(N < 2) return N;
        int prev1 = 0, prev2 = 1;
        
        int num = 0;
        for(int i=2; i<=N; i++) {
            num = prev1+prev2;
            prev1 = prev2;
            prev2 = num;
        }
        return num;
    }
}
