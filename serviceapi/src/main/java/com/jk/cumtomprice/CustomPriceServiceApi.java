package com.jk.cumtomprice;

import com.jk.model.customprice.CustomPriceBean;
import com.jk.utils.PageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


public interface CustomPriceServiceApi {

    @PostMapping("queryCustomPriceList")
    PageResult queryCustomPriceList(CustomPriceBean customPriceBean);
}
