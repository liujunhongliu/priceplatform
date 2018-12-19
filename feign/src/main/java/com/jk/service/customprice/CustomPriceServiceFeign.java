package com.jk.service.customprice;

import com.jk.cumtomprice.CustomPriceServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloudservice")
public interface CustomPriceServiceFeign extends CustomPriceServiceApi {
}
