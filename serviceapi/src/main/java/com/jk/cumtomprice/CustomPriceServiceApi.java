package com.jk.cumtomprice;

import com.jk.model.customprice.CustomPriceBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CustomPriceServiceApi {

    @GetMapping("queryCustomPriceList")
    List<CustomPriceBean> queryCustomPriceList();
}
