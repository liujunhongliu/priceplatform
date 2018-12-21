package com.jk.service.customprice;

import com.jk.model.customprice.CustomPriceBean;
import com.jk.utils.PageResult;

import java.util.List;

public interface CustomPriceService {
    PageResult queryCustomPriceList(CustomPriceBean customPriceBean);
}
