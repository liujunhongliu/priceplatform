package com.jk.service;

import com.jk.mapper.PriceMapper;
import com.jk.model.PrizeBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PriceServiceImpl implements PriceService{
    @Autowired
    private PriceMapper priceMapper;

    @Override
    public List<PrizeBean> queryPrizeList() {
        return priceMapper.queryPrizeList();
    }
}
