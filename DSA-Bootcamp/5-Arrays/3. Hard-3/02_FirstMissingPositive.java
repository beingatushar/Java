// https://leetcode.com/problems/first-missing-positive/submissions/
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                n++;
            }
        }
        return n;
    }
}