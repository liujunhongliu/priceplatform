package com.jk.controller;

import com.jk.model.PrizeBean;
import com.jk.service.PriceServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PriceController {
    @Autowired
    private PriceServiceFeign priceServiceFeign;

    public List<PrizeBean> queryPrizeList(){

        return priceServiceFeign.queryPrizeList();

    }
}
