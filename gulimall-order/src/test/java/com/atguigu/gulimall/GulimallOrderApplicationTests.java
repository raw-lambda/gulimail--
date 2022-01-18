package com.atguigu.gulimall;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.lang.model.SourceVersion;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setMemberId(1L);
        orderEntity.setMemberUsername("张三");
        orderService.save(orderEntity);
        System.out.println("order保存成功！");
    }

}
