package com.wx.lottery.dao;

import com.wx.lottery.bean.DoubleBall;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoubleBallMapper {
     int insertBall(DoubleBall doubleBall);
}
