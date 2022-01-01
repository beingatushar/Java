// https://www.codingninjas.com/codestudio/problems/ninja-and-sorted-arrays_1214628?leftPanelTab=1
class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        if (m > 0 && n > 0) {
            if (arr1[m - 1] > arr2[n - 1]) {
                arr1[m + n - 1] = arr1[m - 1];
                return ninjaAndSortedArrays(arr1, arr2, m - 1, n);
            } else {
                arr1[m + n - 1] = arr2[n - 1];
                return ninjaAndSortedArrays(arr1, arr2, m, n - 1);
            }
        } else if (m > 0) {
            arr1[m + n - 1] = arr1[m - 1];
            return ninjaAndSortedArrays(arr1, arr2, m - 1, n);
        } else if (n > 0) {
            arr1[m + n - 1] = arr2[n - 1];
            return ninjaAndSortedArrays(arr1, arr2, m, n - 1);
        } else {
            return arr1;
        }
    }
}
