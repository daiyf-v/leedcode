package com.billstudy.framework;

/**
 * 介绍：solution task
 *
 * @author: libiao
 * @date: 2020/5/24 22:37
 **/
public interface Solution<X, Y> {

  /**
   * solve the problem
   *
   * @param y param
   * @return result
   */
  X solve(Y y);

}
