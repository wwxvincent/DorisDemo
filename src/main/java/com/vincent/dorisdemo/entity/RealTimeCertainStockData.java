package com.vincent.dorisdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "real_time_stock_data")
public class RealTimeCertainStockData {
    private String code;
    private String date;
    private String recordTime;
    private String market;
    private String price;
    private String f1;
    private String f2;
    private String f3;
}
