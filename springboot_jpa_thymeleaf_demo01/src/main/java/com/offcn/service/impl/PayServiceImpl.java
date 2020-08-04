package com.offcn.service.impl;

import com.offcn.service.PayService;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author 刘晓轩
 * @description 支付服务
 * @date 2020/8/4 0:00
 */
public class PayServiceImpl implements PayService {
    @Override
    public String createNative(String out_trade_no, String price) {
        System.out.println("小丽修改了代码！");
        for (int i = 0; i < 100; i++) {
            System.out.printf("支付服务预下单方法");
        }
        return null;
    }

    @Override
    public Map queryStatus(String out_trade_no) {
        //小丽修改了代码
        if (!StringUtils.isEmpty(out_trade_no)) {
            System.out.println("查询支付状态！");
        }
        return null;
    }
}
