package com.jk.controller;

import com.jk.model.PrizeBean;
import com.jk.service.PriceServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("price")
public class PriceController {
    @Autowired
    private PriceServiceFeign priceServiceFeign;

    @RequestMapping("queryPrizeList")
    @ResponseBody
    public List<PrizeBean> queryPrizeList(){
        List<PrizeBean> prizeBeans = priceServiceFeign.queryPrizeList();
        return prizeBeans;
    }
}
