package com.jk.service.customprice;

import com.jk.mapper.customprice.CustomPriceMapper;
import com.jk.model.customprice.CustomPriceBean;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CustomPriceServiceImpl implements CustomPriceService{
    @Autowired
    private CustomPriceMapper customPriceMapper;
    @Override
    public PageResult queryCustomPriceList(CustomPriceBean customPriceBean) {
        //总返回
        PageResult pageResult = new PageResult();

        HashMap<String, Object> params = new HashMap<>();
        params.put("customPriceBean",customPriceBean);

        params.put("startIndex", (customPriceBean.getPage()-1)*customPriceBean.getRows());
        params.put("endIndex", customPriceBean.getRows());
        //查询count
        int count = customPriceMapper.queryUserCount(params);
        //把查询出来的count放到总返回当中
        pageResult.setTotal(count);
        List<CustomPriceBean> list = customPriceMapper.queryCustomPriceList(params);
        pageResult.setRows(list);
        return pageResult;
    }
}
