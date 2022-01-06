// https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";    
        for (char ch : alphabet.toCharArray()) {
            if (sentence.indexOf(ch) == -1) return false;
        }        
        return true;
    }
}