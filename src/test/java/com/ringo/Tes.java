package com.ringo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tes {
    public static Logger LOGGER= LoggerFactory.getLogger(Tes.class);
    @Test
    public void test(){
        for (int i=0;i<1000000000;i++) {
            LOGGER.error("合理的日志记录1");
            LOGGER.trace("trace");
            LOGGER.error("合理的日志记录2");
            LOGGER.trace("trace");
            LOGGER.error("合理的日志记录3");
            LOGGER.trace("trace");
        }
    }
}
