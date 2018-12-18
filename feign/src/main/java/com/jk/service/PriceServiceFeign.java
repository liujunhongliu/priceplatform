package com.jk.service;

import com.jk.PriceServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloudservice")
public interface PriceServiceFeign extends PriceServiceApi {
}
