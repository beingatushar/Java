import java.util.ArrayList;

// https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_1089580?leftPanelTab=0
class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> arr = new ArrayList<>(n);
        ArrayList<Long> temp = new ArrayList<>(n);
        temp.add((long) 1);
        arr.add(temp);
        for (int i = 0; i < n - 1; i++) {
            temp = new ArrayList<>();
            temp.add((long) 1);
            ArrayList<Long> t = arr.get(i);
            for (int j = 0; j < t.size() - 1; j++) {
                temp.add(t.get(j) + t.get(j + 1));
            }
            temp.add((long) 1);
            arr.add(temp);
        }
        return arr;
    }
}
