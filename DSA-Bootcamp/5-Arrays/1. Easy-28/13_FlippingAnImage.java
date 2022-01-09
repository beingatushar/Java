// https://leetcode.com/problems/flipping-an-image/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length / 2; j++) {
                image[i][j] ^= image[i][image.length - 1 - j];
                image[i][image.length - 1 - j] ^= image[i][j];
                image[i][j] ^= image[i][image.length - 1 - j];
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j] ^= 1;
            }
        }
        return image;
    }
}