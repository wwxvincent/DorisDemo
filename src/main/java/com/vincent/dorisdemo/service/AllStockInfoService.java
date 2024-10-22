package com.vincent.dorisdemo.service;

import com.vincent.dorisdemo.entity.AllStockInfo;

import java.util.List;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
public interface AllStockInfoService {

    public List<AllStockInfo> getAllStockInfo();

    public List<String> getALlStockPattern();
}
