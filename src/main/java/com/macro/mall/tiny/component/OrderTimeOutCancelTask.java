package com.macro.mall.tiny.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 订单超时取消并解锁库存的定时器
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    private void cancelTimeOutOrder(){
        LOGGER.info("取消订单，并根据sku编号释放锁定库存");
    }
}
