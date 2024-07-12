package com.template.app.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定时任务
 *
 * @author Doug Liu
 * @since 2022-06-10
 */
@Component
@Slf4j
public class CustomTask {

    /**
     * 每天晚上23点执行一次
     */
    @Scheduled(cron = "0 0 23 * * ?")
    public void syncData() {
        log.debug("同步数据");
    }

    @Transactional
    public void test() {
        log.debug("test");
    }

}
