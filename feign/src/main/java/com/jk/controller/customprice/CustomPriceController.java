package com.jk.controller.customprice;

import com.jk.model.customprice.CustomPriceBean;
import com.jk.service.customprice.CustomPriceServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("customPrice")
public class CustomPriceController {

    @Autowired
    private CustomPriceServiceFeign customPriceServiceFeign;


    @RequestMapping("queryCustomPriceList")
    @ResponseBody
    public List<CustomPriceBean> queryCustomPriceList(){
        List<CustomPriceBean> customPriceBeans = customPriceServiceFeign.queryCustomPriceList();
        return customPriceBeans;
    }




}
