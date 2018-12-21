package com.jk.controller;

import com.jk.PriceServiceApi;
import com.jk.model.PrizeBean;
import com.jk.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PriceController implements PriceServiceApi {
    @Autowired
    private PriceService priceService;

    @Override
    public List<PrizeBean> queryPrizeList() {
        return priceService.queryPrizeList();
    }
}
