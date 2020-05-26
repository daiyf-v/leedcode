package com.billstudy.leetcode.algo.array;

import com.billstudy.framework.Solutions;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 *
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 *
 * 示例 1:
 * <block>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3 <br/> 输出: [5,6,7,1,2,3,4] <br/> 解释: 向右旋转 1 步: [7,1,2,3,4,5,6] <br/>
 * 向右旋转 2 步: [6,7,1,2,3,4,5] <br/> 向右旋转 3 步: [5,6,7,1,2,3,4] <br/>
 * </block>
 *
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 *
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * @author: libiao
 * @date: 2020/5/25 08:38
 **/
public class AlgorithmElementaryArray03RotateArrayTest {


  private static Solutions<ParamPair, int[]> solutions;

  @BeforeAll
  public static void beforeAll() {
    solutions = new Solutions();
  }

  /**
   * 输入: [1,2,3,4,5,6,7] 和 k = 3
   *
   * 输出: [5,6,7,1,2,3,4]
   *
   * 解释:
   *
   * 向右旋转 1 步: [7,1,2,3,4,5,6]
   *
   * 向右旋转 2 步: [6,7,1,2,3,4,5]
   *
   * 向右旋转 3 步: [5,6,7,1,2,3,4]
   */
  @Test
  public void testCase01() {
    Assertions.fail();
  }

  /**
   * 输入: [-1,-100,3,99] 和 k = 2
   *
   * 输出: [3,99,-1,-100]
   *
   * 解释:
   *
   * 向右旋转 1 步: [99,-1,-100,3]
   *
   * 向右旋转 2 步: [3,99,-1,-100]
   */
  @Test
  public void testCase02() {
    Assertions.fail();
  }

  @Data
  private class ParamPair {

    private int[] array;
    private int key;

  }


}
