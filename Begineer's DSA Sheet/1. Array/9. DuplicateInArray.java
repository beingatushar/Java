
// https://www.codingninjas.com/codestudio/problems/duplicate-in-array_893397?leftPanelTab=1
import java.util.ArrayList;

class Solution {
    public static int findDuplicate(ArrayList<Integer> arr) {
        int count[] = new int[arr.size()];
        for (int i : arr) {
            if (count[i - 1] >= 1) {
                return i;
            }
            count[i - 1]++;
        }
        return -1;
    }
}