package com.wx.lottery.dao;

import com.wx.lottery.bean.DoubleBall;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DoubleBallDaoTest {
    @Resource
    DoubleBallMapper doubleBallMapper;

    @Test
    public void testDB(){
        DoubleBall doubleBall = new DoubleBall();
        doubleBall.setCode("codedemo");
        doubleBall.setRed1(1);
        doubleBall.setRed2(23);
        doubleBall.setRed3(23);
        doubleBall.setRed4(23);
        doubleBall.setRed5(23);
        doubleBall.setRed6(23);
        doubleBall.setBlue(23);
        doubleBall.setDate("20190203");
        int temp = doubleBallMapper.insertBall(doubleBall);
        System.out.println(temp);
    }
}