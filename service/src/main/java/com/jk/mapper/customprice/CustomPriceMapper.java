package com.jk.mapper.customprice;

import com.jk.model.customprice.CustomPriceBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CustomPriceMapper {

    List<CustomPriceBean> queryCustomPriceList(HashMap<String, Object> params);

    int queryUserCount(HashMap<String, Object> params);
}
