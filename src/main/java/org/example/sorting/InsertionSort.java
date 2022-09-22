package org.example.sorting;

public class InsertionSort {

    public void sort(int[] unsortedArray) {
        // 1, 3, 6, 10, 3 2 5 ->
        int n = unsortedArray.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int temp = unsortedArray[j];
            while (j > 0 && temp < unsortedArray[j - 1]) {
                unsortedArray[j] = unsortedArray[j - 1];
                j--;
            }
            unsortedArray[j] = temp;
        }
        for (int t : unsortedArray) {
            System.out.print(" " + t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {1, 5, 2, 7, 8, 2, 4, 5, 1, -1, 0};  // i = 1, j = 2, t = 2
        insertionSort.sort(array);
//        reduce the problem to smaller problem.
//        to sort lets assume all the left elements are sorted and we need to extend sorted array size by one.
//        worst case complexity is (n)2, best case complexity is O(n);
    }
}
