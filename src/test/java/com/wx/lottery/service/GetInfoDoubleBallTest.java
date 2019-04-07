package com.wx.lottery.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class GetInfoDoubleBallTest {
    @Resource
    GetInfoDoubleBall getInfoDoubleBall;

    @Test
    public void test1() {
       System.out.println(getInfoDoubleBall.getLotteryInfo());
    }
}