package com.example.boot35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author Moritz Halbritter
 */
class MySlowInitBean implements InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MySlowInitBean.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("MySlowInitBean init ...");
        Thread.sleep(5000);
        LOGGER.info("MySlowInitBean init done!");
    }
}
