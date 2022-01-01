// https://leetcode.com/problems/to-lower-case/submissions/
class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c -= 'A';
                c += 'a';
            }
            ans += c;
        }
        return ans;
    }
}