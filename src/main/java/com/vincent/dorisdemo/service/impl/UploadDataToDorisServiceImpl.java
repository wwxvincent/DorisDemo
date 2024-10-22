package com.vincent.dorisdemo.service.impl;

import com.vincent.dorisdemo.service.AllStockInfoService;
import com.vincent.dorisdemo.service.UploadDataToDorisService;
import com.vincent.dorisdemo.util.DorisUtil;
import com.vincent.dorisdemo.util.StockUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/22/24
 * @Description:
 */
public class UploadDataToDorisServiceImpl implements UploadDataToDorisService {

    @Autowired
    private AllStockInfoService allStockInfoService;

    private List<String> patternList = allStockInfoService.getALlStockPattern();

//    @Autowired
//    public boolean UploadData(String type){
//        List<String> urlList = StockUtil.getUrlsList(patternList, type);
//        StockUtil.
//    }
}
