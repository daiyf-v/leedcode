package com.billstudy.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

/**
 * 介绍：测试集合相关的功能
 *
 * @author: libiao
 * @date: 2020/5/24 20:08
 **/
@Log
public class ListTest {


  @Test
  public void testCase01(){
    List<Integer> list = new ArrayList<Integer>(1000);

    IntStream.rangeClosed(1, 100).forEach(v -> list.add(v));

    log.info(list.toString());


  }


}
