package com.template.util;

import java.util.*;

public class MathUtil {

    private static final String DEFAULT_DIGITS = "0";

    private static final String FIRST_DEFAULT_DIGITS = "1";

    /**
     * 根据指定的长度，为目标数字补充数字，使其位数达到指定长度。
     * @param target 目标数字，以字符串形式表示。
     * @param length 需要补充到的位数。如果目标数字的位数小于这个长度，将在目标数字左侧补充默认数字（默认为0），第一位默认补充1。
     * @return 补充后的目标数字字符串。
     */
    public static String makeUpNewData(String target, int length) {
        return makeUpNewData(target, length, DEFAULT_DIGITS);
    }

    /**
     * 补充目标数字到指定长度
     * @param target 目标数字，可以为负数
     * @param length 需要补充到的位数
     * @param add    需要补充的数字, 补充默认数字[0], 第一位默认补充[1]
     * @return 补充后的结果，保证长度至少为length
     */
    public static String makeUpNewData(String target, int length, String add) {
        // 移除目标数字前导的"-"
        if (target.startsWith("-")) {
            target = target.replace("-", "");
        }
        // 如果目标数字长度已经满足要求，则直接返回前length位
        if (target.length() >= length) {
            return target.substring(0, length);
        }
        StringBuilder sb = new StringBuilder(FIRST_DEFAULT_DIGITS); // 使用默认数字补充前导位
        // 循环补充指定的数字
        for (int i = 0; i < length - (1 + target.length()); i++) {
            sb.append(add);
        }
        // 追加目标数字到结果中
        return sb.append(target).toString();
    }

    /**
     * 生产一个随机的指定位数的字符串数字
     *
     * @param length 指定长度
     * @return String
     */
    public static String randomDigitNumber(int length) {
        // 1000+8999=9999
        int start = Integer.parseInt(makeUpNewData("", length));
        // 9000
        int end = Integer.parseInt(makeUpNewData("", length + 1)) - start;
        return (int) (Math.random() * end) + start + "";
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
     * 获取两个String数组中互相不重复的部分
     */
    public static List<String> getUniqueElements(String[] array1, String[] array2) {
        // 创建两个 HashSet,分别存储 array1 和 array2 中的元素
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));
        // 创建一个新的 HashSet,用于存储最终结果
        Set<String> resultSet = new HashSet<>();


        // 遍历 set1 中的元素，如果该元素不在 set2 中出现，则将其添加到 resultSet 中
        for (String element : set1) {
            if (!set2.contains(element)) {
                resultSet.add(element);
            }
        }
        // 遍历 set2 中的元素，如果该元素不在 set1 中出现，则将其添加到 resultSet 中
        for (String element : set2) {
            if (!set1.contains(element)) {
                resultSet.add(element);
            }
        }

        // 将 resultSet 转换为 ArrayList 并返回
        return new ArrayList<>(resultSet);

    }

    /**
     * 寻找最大值
     * @param arr
     * @return
     */
    public static int findMaximum(int[] arr) {
        if (arr.length <= 0) {
            return 0;
        }
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -7, 2};
        System.out.println("数组中的最大值为: " + findMaximum(arr));
    }


}