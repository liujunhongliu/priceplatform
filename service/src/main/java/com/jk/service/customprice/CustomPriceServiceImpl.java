package com.jk.service.customprice;

import com.jk.mapper.customprice.CustomPriceMapper;
import com.jk.model.customprice.CustomPriceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomPriceServiceImpl implements CustomPriceService{
    @Autowired
    private CustomPriceMapper customPriceMapper;
    @Override
    public List<CustomPriceBean> queryCustomPriceList() {
        return customPriceMapper.queryCustomPriceList();
    }
}
