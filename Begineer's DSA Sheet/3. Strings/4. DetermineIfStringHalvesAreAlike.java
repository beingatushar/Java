// https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int sum1 = 0;
        int sum2 = 0;
        char vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < len / 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + len / 2);
            for (char v : vowels) {
                if (v == a)
                    sum1++;
                if (v == b)
                    sum2++;
            }
        }
        return sum1 == sum2;
    }
}