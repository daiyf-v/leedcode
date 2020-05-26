package com.billstudy.leetcode.algo.array.solution;

import com.billstudy.framework.Solution;

/**
 * 介绍：solution
 *
 * @author: libiao
 * @date: 2020/5/24 22:36
 **/
public class BestTimeBuyAndSellStocksIISolutionByValleyPeak implements Solution<Integer, int[]> {


  /**
   * Solution02 : Calculate the difference in the stock price from each valley to the peak is the
   * profit, and the sum is the total maximum profit
   *
   * https://leetcode-cn.com/articles/best-time-to-buy-and-sell-stock-ii/ #Method 02
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
    int valley = 0;
    int peak = 0;
    int i = 0;

    while( i < pricesLength - 1){
      while ( i < pricesLength - 1 && (prices[i + 1] <= prices[i])){
        i++;
      }

      // Minimum value
      valley = prices[i];

      while( i < pricesLength - 1 && (prices[i + 1] >= prices[i])){
        i++;
      }

      // Maximum value
      peak = prices[i];

      totalProfit += peak - valley;

    }

    return totalProfit;
  }
}
