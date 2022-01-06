import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        int k;
        if (ruleKey.equals("type")) {
            k = 0;
        } else if (ruleKey.equals("color")) {
            k = 1;
        } else {
            k = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(k).equals(ruleValue))
                c++;
        }
        return c;
    }
}