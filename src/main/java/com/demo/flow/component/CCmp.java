package com.demo.flow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * @author: dongdahai
 * @date: 2023/7/3
 */
@Component("c")
public class CCmp extends NodeComponent {

    public void process() throws Exception {
        System.out.println("CCmp executed!");
    }
}
