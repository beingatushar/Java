// https://www.codingninjas.com/codestudio/problems/ninja-and-sorted-arrays_1214628?leftPanelTab=0
class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        while (m > 0 && n > 0) {
            if (arr1[m - 1] > arr2[n - 1]) {
                arr1[m + n - 1] = arr1[m - 1];
                m--;
            } else {
                arr1[m + n - 1] = arr2[n - 1];
                n--;
            }
        }
        while (m > 0) {
            arr1[m + n - 1] = arr1[m - 1];
            m--;
        }
        while (n > 0) {
            arr1[m + n - 1] = arr2[n - 1];
            n--;
        }
        return arr1;
    }
}
