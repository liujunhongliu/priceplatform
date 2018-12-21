package com.jk.mapper;

import com.jk.model.PrizeBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PriceMapper {

    List<PrizeBean> queryPrizeList();
}
