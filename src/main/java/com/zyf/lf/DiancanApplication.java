package com.zyf.lf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling   // 开启定时任务
@SpringBootApplication
@ServletComponentScan
public class DiancanApplication {

    private static Logger log = LoggerFactory.getLogger(DiancanApplication.class);

    public static void main(String[] args) {
        log.info("============ DiancanApplication 启动================");
        SpringApplication.run(DiancanApplication.class, args);
    }

}
