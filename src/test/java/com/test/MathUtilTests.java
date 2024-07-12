package com.test;

import org.junit.jupiter.api.Test;

import com.template.util.MathUtil;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MathUtilTests {

    @Test
    public void testQuickSortAsc() {
        int[] arr = {3, 1, 2};
        int[] expected = {1, 2, 3};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }


    @Test
    public void testQuickSortDesc() {
        // 测试快速排序函数
        int[] arr = {3, 2, 1};
        // 期望的结果
        int[] expected = {1, 2, 3};
        // 调用快速排序函数
        MathUtil.quickSort(arr, 0, arr.length - 1);
        // 断言结果是否一致
        assertArrayEquals(expected, arr);
    }


    @Test
    public void testQuickSortEmpty() {
        // 测试空数组
        int[] arr = {};
        int[] expected = {};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortSingleElement() {
        // 测试只有一个元素的数组
        int[] arr = {1};
        int[] expected = {1};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
    @Test

    // 测试已经排序的数组
    public void testQuickSortAlreadySorted() {
        // 定义一个已经排序的数组
        int[] arr = {1, 2, 3};
        // 定义一个期望的数组
        int[] expected = {1, 2, 3};
        // 对数组进行快速排序
        MathUtil.quickSort(arr, 0, arr.length - 1);
        // 比较排序后的数组和期望的数组是否相等
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortAlreadySorted() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortLargeArray() {
        // 生成一个用于测试的大随机数组
        java.util.Random rand = new java.util.Random();
        int size = 1000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10);
        }

        int[] expected = Arrays.copyOf(arr, arr.length);

        Arrays.sort(expected);

        // 调用快速排序函数
    
        // 使用快速排序算法对数组进行排序
        MathUtil.quickSort(arr, 0, arr.length - 1);
    
        // 验证数组是否已排序
        for (int i = 0; i < size - 1; i++) {
            // 确保数组中的元素按照升序排列
            assert arr[i] <= arr[i + 1];
        }
    }

    @Test
    public void testQuickSort_EmptyArray() {
        int[] arr = {};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testQuickSort_SingleElementArray() {
        int[] arr = {5};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        asse
        rtArrayEquals(new int[]{5}, arr);
    }

    @Test           
       public void testQuickSort_SortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MathUtil.quickSort(arr, 0, arr.length - 1);
    }

    @Test
    public void testQuickSort_TwoElementArray() {
        int[] arr = {5, 1};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 5}, arr);
    }

    @Test
    public void testQuickSort_MultipleElementsArray() {
        int[] arr = {5, 3, 8, 4, 2};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    public void testQuickSort_AlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testQuickSort_ReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testQuickSort_ArrayWithDuplicates() {
        int[] arr = {5, 3, 5, 2, 1, 5, 4};
        MathUtil.quickSort(arr, 0, arr.length - 1);
        // 注意，由于快速排序的不稳定性，重复的元素可能不会完全按照输入顺序排序，但是应该是排序好的。
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 5}, arr);
    }
}