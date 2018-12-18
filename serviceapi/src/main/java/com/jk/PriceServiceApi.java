package com.jk;

import com.jk.model.PrizeBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface PriceServiceApi {
    @GetMapping("queryPrizeList")
    List<PrizeBean> queryPrizeList();
}
