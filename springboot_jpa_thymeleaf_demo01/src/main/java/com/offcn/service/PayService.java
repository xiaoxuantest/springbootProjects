package com.offcn.service;

import java.util.Map;

/**
 * @author 刘晓轩
 * @description 支付服务接口
 * @date 2020/8/3 23:59
 */
public interface PayService {
    public String createNative(String out_trade_no,String price);

    public Map queryStatus(String out_trade_no);
}
