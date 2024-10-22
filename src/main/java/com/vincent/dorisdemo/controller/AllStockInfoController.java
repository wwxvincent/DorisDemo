package com.vincent.dorisdemo.controller;

import com.vincent.dorisdemo.entity.AllStockInfo;
import com.vincent.dorisdemo.service.AllStockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
@RestController
@RequestMapping("/allStockInfo")
public class AllStockInfoController {

    @Autowired
    private AllStockInfoService allStockInfoService;

    @GetMapping("/getAllStockInfo")
    public List<AllStockInfo> getAllStockInfo() {

        return allStockInfoService.getAllStockInfo();
    }

    @GetMapping("/getAllStockPattern")
    public List<String> getAllStockPattern() {
        List<String> resultList = new ArrayList<>();
        for (AllStockInfo allStockInfo : allStockInfoService.getAllStockInfo()) {
            resultList.add(allStockInfo.getF13()+"."+allStockInfo.getF12());
        }
        return resultList;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
