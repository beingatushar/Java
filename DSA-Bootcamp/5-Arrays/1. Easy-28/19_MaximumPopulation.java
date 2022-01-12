// https://leetcode.com/problems/maximum-population-year/submissions/
class Solution {
    public int maximumPopulation(int[][] logs) {
        int check[] = new int[101];
        for (int i[] : logs) {
            for (int j = i[0]; j < i[1]; j++)
                check[j - 1950]++;
        }
        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (check[i] > check[max]) {
                max = i;
            }
        }
        System.gc();
        return max + 1950;
    }
}