package com.jk.service;

import com.jk.mapper.PriceMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class PriceServiceImpl implements PriceService{
    @Autowired
    private PriceMapper priceMapper;
}
