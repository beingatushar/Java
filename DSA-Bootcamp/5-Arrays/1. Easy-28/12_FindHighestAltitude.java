// https://leetcode.com/problems/find-the-highest-altitude/submissions/
class Solution {
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++) gain[i]+=gain[i-1];
        int max=0;
        for(int i:gain){
            if(max<i)max=i;
        }
        return max;
    }
}