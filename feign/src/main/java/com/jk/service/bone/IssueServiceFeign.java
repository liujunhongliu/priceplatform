package com.jk.service.bone;

import com.jk.bone.IssueServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloudservice")
public interface IssueServiceFeign extends IssueServiceApi {
}
