package com.billstudy.leetcode.algo.array;

/**
 * 介绍：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 *
 * @author: libiao
 * @date: 2020/5/17 22:25
 **/
public class AlgorithmElementaryArray01DuplicatesRemove {
  public static int removeDuplicates(int[] nums) {
    if(nums == null || nums.length <= 0){
      return 0;
    }

    int lastEle = nums[0];
    int lastCanBeFillPos = 0;
    for (int i = 1; i < nums.length ; i++){
      if (lastEle != nums[i]){
        lastEle = nums[i];
        nums[++lastCanBeFillPos] = nums[i];
      }
    }

    return lastCanBeFillPos + 1;
  }


  private AlgorithmElementaryArray01DuplicatesRemove(){}

}
