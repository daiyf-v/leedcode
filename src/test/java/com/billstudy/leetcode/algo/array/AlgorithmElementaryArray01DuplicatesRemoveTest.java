package com.billstudy.leetcode.algo.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 介绍：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 *
 * 删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @author: libiao
 * @date: 2020/5/17 22:27
 **/
public class AlgorithmElementaryArray01DuplicatesRemoveTest {


  /**
   * 给定数组 nums = [1,1,2],
   *
   * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
   *
   * 你不需要考虑数组中超出新长度后面的元素。
   */
  @Test
  public void testCase01() {

    // test case 01
    int[] nums = {1, 1, 2};
    int len = AlgorithmElementaryArray01DuplicatesRemove.removeDuplicates(nums);

    // len match
    Assertions.assertEquals(2, len);

    // array element match
    int[] newArray = new int[len];
    System.arraycopy(nums, 0, newArray, 0, len);
    Assertions.assertArrayEquals(new int[]{1, 2}, newArray);
  }

  /**
   * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
   *
   * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
   *
   * 你不需要考虑数组中超出新长度后面的元素。
   */
  @Test
  public void testCase02() {

    // test case 02
    int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int len = AlgorithmElementaryArray01DuplicatesRemove.removeDuplicates(nums);

    // len match
    Assertions.assertEquals(5, len);

    // array element match
    int[] newArray = new int[len];
    System.arraycopy(nums, 0, newArray, 0, len);
    Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, newArray);

  }

  @Test
  public void testCase03() {

    // test case 03
    int[] nums = new int[]{1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 8};
    int len = AlgorithmElementaryArray01DuplicatesRemove.removeDuplicates(nums);

    // len match
    Assertions.assertEquals(8, len);

    // array element match
    int[] newArray = new int[len];
    System.arraycopy(nums, 0, newArray, 0, len);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, newArray);

  }

  @Test
  public void testCase04() {

    // test case 04
    int[] nums = new int[]{};
    int len = AlgorithmElementaryArray01DuplicatesRemove.removeDuplicates(nums);

    // len match
    Assertions.assertEquals(0, len);

    // array element match
    int[] newArray = new int[len];
    Assertions.assertArrayEquals(new int[]{}, newArray);

  }

}
