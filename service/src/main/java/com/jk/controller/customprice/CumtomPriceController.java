package com.jk.controller.customprice;

import com.jk.cumtomprice.CustomPriceServiceApi;
import com.jk.model.customprice.CustomPriceBean;
import com.jk.service.customprice.CustomPriceService;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CumtomPriceController implements CustomPriceServiceApi {

    @Autowired
    private CustomPriceService customPriceService;

    @Override
    public PageResult queryCustomPriceList(@RequestBody CustomPriceBean customPriceBean) {
        return customPriceService.queryCustomPriceList(customPriceBean);
    }
}
