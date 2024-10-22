package com.vincent.dorisdemo.service.impl;

import com.vincent.dorisdemo.entity.AllStockInfo;
import com.vincent.dorisdemo.mapper.AllStockInfoMapper;
import com.vincent.dorisdemo.service.AllStockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
@Service
public class AllStockInfoServiceImpl implements AllStockInfoService {

    @Autowired
    private AllStockInfoMapper allStockInfoMapper;

    @Override
    public List<AllStockInfo> getAllStockInfo() {
        return allStockInfoMapper.getAllStockInfo();
    }

    @Override
    public List<String> getALlStockPattern() {
        List<String> resultList = new ArrayList<>();
        for (AllStockInfo allStockInfo : allStockInfoMapper.getAllStockInfo()) {
            resultList.add(allStockInfo.getF13()+"."+allStockInfo.getF12());
        }
        return resultList;
    }
}
