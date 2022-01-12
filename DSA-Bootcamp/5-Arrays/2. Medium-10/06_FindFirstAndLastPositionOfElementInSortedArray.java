// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target);
        if (left == -1)
            return new int[] { -1, -1 };
        int right = left;
        for (; left >= 0 && nums[left] == target; left--)
            ;
        for (; right < nums.length && nums[right] == target; right++)
            ;
        return new int[] { left + 1, right - 1 };
    }

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[l] == x)
                return l;
            if (arr[r] == x)
                return r;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}