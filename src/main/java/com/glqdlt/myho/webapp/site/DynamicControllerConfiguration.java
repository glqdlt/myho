package com.glqdlt.myho.webapp.site;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author glqdlt
 */
//@Configuration
public class DynamicControllerConfiguration {

    @Bean
    public SimpleUrlHandlerMapping addHandler(DynamicController dynamicController) {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setOrder(0);
        Map<String, DynamicController> urlMap = new HashMap<>();
        urlMap.put("/view/*", dynamicController);
        simpleUrlHandlerMapping.setUrlMap(urlMap);
        return simpleUrlHandlerMapping;
    }
}
