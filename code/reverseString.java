// https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/

class Solution {
    /*
        n: array len
        time: O(n)
        space: O(1)
    */
    public void reverseString(char[] s) {
        if(s == null) return;
        int left=0, right=s.length-1;
        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
