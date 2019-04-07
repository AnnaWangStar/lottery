package com.wx.lottery.controller;

import com.wx.lottery.service.GetInfoDoubleBall;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LotteryController {
    @Resource
    GetInfoDoubleBall getInfoDoubleBall;

    @RequestMapping("/resule")
    public String getLotteryResult(@RequestParam("type") String type){
        if(type.equals("doubleball")){
            return getInfoDoubleBall.getLotteryInfo();
        }
        return null;
    }

}
