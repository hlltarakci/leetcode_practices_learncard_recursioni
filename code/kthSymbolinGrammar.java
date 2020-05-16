// https://leetcode.com/explore/learn/card/recursion-i/253/conclusion/1675/

class Solution {
    /*
        time: O(n)
        space: O(n)
    */
    public int kthGrammar(int N, int K) {
        if (N == 1 && K == 1) return 0;
        
        int prev = kthGrammar(N - 1, (K + 1) / 2);
        if ((K % 2 == 0 && prev == 0) || (K % 2 == 1 && prev == 1)) return 1;
    
        return 0;
    }
}
