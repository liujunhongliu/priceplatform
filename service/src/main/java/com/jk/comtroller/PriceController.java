package com.jk.comtroller;

import com.jk.PriceServiceApi;
import com.jk.model.PrizeBean;
import com.jk.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PriceController implements PriceServiceApi {
    @Autowired
    private PriceService priceService;

    @Override
    public List<PrizeBean> queryPrizeList() {
        return priceService.queryPrizeList();
    }
}
