package com.billstudy.leetcode.algo.array.solution;

import com.billstudy.framework.Solution;



/**
 * 介绍：solution
 *
 * @author: libiao
 * @date: 2020/5/24 22:46
 **/
public class BestTimeBuyAndSellStocksIISolutionByTwoAdjacentStockPrices implements Solution<Integer, int[]> {


  /**
   * Solution01 : Calculate the sum of the profits of each two adjacent stock prices
   *
   * https://leetcode-cn.com/articles/best-time-to-buy-and-sell-stock-ii/ #Method 03
   *
   *
   * Time complexity: O(n) & Space complexity: O(1)
   *
   * @return max profit
   */
  @Override
  public Integer solve(int[] prices) {
    int pricesLength = prices.length;

    if (prices == null || pricesLength == 0) {
      return 0;
    }

    int totalProfit = 0;

    for (int i = 1; i < pricesLength; i++) {
      if (prices[i] > prices[i - 1]) {
        totalProfit += prices[i] - prices[i - 1];
      }
    }
    return totalProfit;
  }
}
