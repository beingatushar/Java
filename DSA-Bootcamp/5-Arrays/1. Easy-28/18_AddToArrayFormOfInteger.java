import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = num.length - 1; i >= 0 || k != 0; i--) {
            if (i >= 0)
                k += num[i];
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}