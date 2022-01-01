// https://leetcode.com/problems/flipping-an-image/submissions/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] i : image) {
            for (int j = 0; j < i.length; j++) {
                i[j] ^= 1;
            }
        }
        for (int[] i : image) {
            for (int j = 0; j < i.length / 2; j++) {
                int b = i[i.length - 1 - j];
                i[i.length - 1 - j] = i[j];
                i[j] = b;
            }
        }
        return image;
    }
}