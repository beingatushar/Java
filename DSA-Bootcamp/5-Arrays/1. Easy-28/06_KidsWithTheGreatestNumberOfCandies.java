// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = 0;
        for (int i : candies) {
            max = (i > max) ? i : max;
        }
        for (int i : candies) {
            list.add(i + extraCandies >= max);
        }
        return list;
    }
}