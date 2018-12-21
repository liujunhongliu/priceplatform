package com.jk.comtroller.customprice;

import com.jk.cumtomprice.CustomPriceServiceApi;
import com.jk.model.customprice.CustomPriceBean;
import com.jk.service.customprice.CustomPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CumtomPriceController implements CustomPriceServiceApi {

    @Autowired
    private CustomPriceService customPriceService;

    @Override
    public List<CustomPriceBean> queryCustomPriceList() {
        return customPriceService.queryCustomPriceList();
    }
}
