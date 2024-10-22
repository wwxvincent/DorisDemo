package com.vincent.dorisdemo.controller;

import com.vincent.dorisdemo.service.AllStockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/22/24
 * @Description:
 */
@RestController
@RequestMapping("/uploadToDoris")
public class UploadDataToDorisController {

    @Autowired
    private AllStockInfoService allStockInfoService;

    @PostMapping("/uploadRealTimeData")
    public void uploadRealTimeData() {
        //get all stock partten info to resemble url
    }
}
