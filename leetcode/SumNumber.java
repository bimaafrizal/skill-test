package leetcode;

import java.util.Arrays;

public class SumNumber {
    public static void main(String[] args) {
        int[] angka = { 2, 7, 11, 15 };
        int[] angka2 = { 3, 2, 4 };
        System.out.println(Arrays.toString(twoSum(angka, 9)));
        System.out.println(Arrays.toString(twoSum(angka2, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // ArrayList<Integer> tampung = new Arraylist<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int[] tampung = new int[2];
                    if (nums[i] + nums[j] == target) {
                        tampung[0] = i;
                        tampung[1] = j;
                        return tampung;
                    }
                }
            }
        }
        return null;
    }

    // public static int cekIndex(int[] nums, int target) {
    // int index = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == target) {
    // index = i;
    // break;
    // }
    // }
    // return index;
    // }
    // public int[] twoSum(int[] nums, int target) {
    // int len = nums.length - 1;
    // int i = 0;
    // while (len > 0) {
    // int sum = nums[len] + nums[i];
    // if (sum == target) {
    // return new int[] { i, len };
    // } else if (i < (len - 1)) {
    // i++;
    // } else {
    // len--;
    // i = 0;
    // }
    // }
    // return null;
    // }
}
