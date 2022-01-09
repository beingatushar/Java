// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int i : position) {
            if (i % 2 == 0)
                even++;
        }
        return Math.min(position.length - even, even);
    }
}