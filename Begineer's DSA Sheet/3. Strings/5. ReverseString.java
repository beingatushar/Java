// https://www.codingninjas.com/codestudio/problems/reverse-the-string_799927?leftPanelTab=1
class Solution {
    public static String reverseString(String str) {
        StringBuilder s = new StringBuilder(str);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char c = s.charAt(i);
            s.setCharAt(i, s.charAt(len - i - 1));
            s.setCharAt(len - i - 1, c);
        }
        return s.toString();
    }
}
