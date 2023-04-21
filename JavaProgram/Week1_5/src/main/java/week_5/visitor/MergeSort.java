package week_5.visitor;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] intArr = {1,5,3,2,4,9,6,8,0,7};
        mergesort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static void mergesort(int[] intArr) {
        int start = 0;
        int end = intArr.length - 1;
        mergesort_rec(intArr, start, end);
    }
    public static void mergesort_rec(int[] intArr, int start, int end) {
        if (end - start > 0) {
            int mid = (start + end) / 2;
            mergesort_rec(intArr, start, mid);
            mergesort_rec(intArr, mid+1, end);
            merge(intArr, start, mid, end);
        }
    }
    public static void merge(int[] intArr, int start, int mid, int end) {
        int[] leftArr = Arrays.copyOfRange(intArr, start, mid+1);
        int[] rightArr = Arrays.copyOfRange(intArr, mid+1, end+1);
        int left = 0;
        int right = 0;
        int dest = start;
        while (left < leftArr.length && right < rightArr.length) {
            if (leftArr[left] <= rightArr[right]) {
                intArr[dest] = leftArr[left];
                left++;
            } else {
                intArr[dest] = rightArr[right];
                right++;
            }
            dest++;
        }
        while (left < leftArr.length) {
            intArr[dest] = leftArr[left];
            left++;
            dest++;
        }
        while (right < rightArr.length) {
            intArr[dest] = rightArr[right];
            right++;
            dest++;
        }
    }
}