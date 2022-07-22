package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };
        int sumNum[] = new int[nums1.length + nums2.length];
        double median = 0;

        // insert to array
        for (int i = 0; i < nums1.length; i++) {
            sumNum[i] = nums1[i];
        }
        for (int j = nums1.length; j < nums1.length + nums2.length; j++) {
            sumNum[j] = nums2[j - nums1.length];
        }

        // shorting
        for (int i = 0; i < sumNum.length; i++) {
            for (int j = 0; j < sumNum.length - 1; j++) {
                if (sumNum[j] > sumNum[j + 1]) {
                    int temp = sumNum[j];
                    sumNum[j] = sumNum[j + 1];
                    sumNum[j + 1] = temp;
                }
            }
        }

        if (sumNum.length % 2 == 1) {
            median = sumNum[sumNum.length / 2];
            System.out.println(median);
        } else {
            median = sumNum[sumNum.length / 2] + sumNum[sumNum.length / 2 - 1];
            System.out.println(median / 2);
        }
    }
}
