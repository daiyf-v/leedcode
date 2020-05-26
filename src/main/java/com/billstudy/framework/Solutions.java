package com.billstudy.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * Solutions : combine many solution
 *
 * @author: libiao
 * @date: 2020/5/24 22:33
 **/
public class Solutions<X, Y> {

  private final List<Solution<X, Y>> solutions;

  public List<Solution<X, Y>> getSolutions(){
    return this.solutions;
  }

  public Solutions(){
    this.solutions = new ArrayList(5);
  }

  public void add(Solution solution) {
    this.solutions.add(solution);
  }

}
