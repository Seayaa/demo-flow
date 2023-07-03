package com.demo.flow.web;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: dongdahai
 * @date: 2023/7/3
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping("/flow")
    public String testFlow() throws Exception {
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "test");
        return "ok";
    }
}
