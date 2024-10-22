package com.vincent.dorisdemo.mapper;

import com.vincent.dorisdemo.entity.AllStockInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
@Mapper
public interface AllStockInfoMapper {
    List<AllStockInfo> getAllStockInfo();
}
