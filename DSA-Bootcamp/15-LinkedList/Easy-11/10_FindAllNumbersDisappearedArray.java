// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i : nums) {
            if (i <= nums.length)
                arr[i - 1]++;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i - 1] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}