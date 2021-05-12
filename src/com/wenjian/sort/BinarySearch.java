package com.wenjian.sort;

import java.util.Arrays;
import java.util.Objects;

/**
 * 二分查找算法
 *
 * @author nn
 * @date 2021/5/11 - 14:06
 */
public class BinarySearch {

    /**
     * 在有中查找某一特定元素的搜索算法
     *
     * @param nums   有序数组
     * @param target 查找值
     * @return 结果，找到为1，没有找到为-1
     */
    public static int binarySearch(int[] nums, int target) {
        int left = 0;// 左边值
        int right = nums.length - 1;// 右边值
        while (left <= right) {
            // int midIndex = (left + right) / 2;
            // int midIndex = (left + right) >>> 1;// 无符号右移
            int midIndex = (left + right) >> 1;// 带符号右移
            int midValue = nums[midIndex];
            if (Objects.equals(midValue, target)) {
                return 1; // 找到返回1
            } else if (target > midValue) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        return -1;// 没有找到为-1
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 12, 13, 15, 16, 17, 18};
        System.out.println("结果：" + (binarySearch(nums, 12) == 1 ? "找到" : "没有找到"));
        System.out.println("结果：" + (binarySearch(nums, 50) == 1 ? "找到" : "没有找到"));
        System.out.println("结果：" + (Arrays.binarySearch(nums, 13) > 0 ? "找到" : "没有找到"));
        System.out.println("结果：" + (Arrays.binarySearch(nums, 100) > 0 ? "找到" : "没有找到"));
    }

}

