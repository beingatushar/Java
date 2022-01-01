// https://leetcode.com/problems/sorting-the-sentence/submissions/
class Solution {
    public String sortSentence(String s) {
        String word[] = s.split(" ");
        String sorted[] = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            int index = word[i].charAt(word[i].length() - 1) - '1';
            sorted[index] = word[i].substring(0, word[i].length() - 1);
        }
        String ans = "";
        for (int i = 0; i < sorted.length - 1; i++) {
            ans += sorted[i] + " ";
        }
        ans += sorted[sorted.length - 1];
        return ans;
    }
}