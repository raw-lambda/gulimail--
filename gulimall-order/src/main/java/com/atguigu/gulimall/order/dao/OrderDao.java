package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lambda
 * @email lambda@gmail.com
 * @date 2022-01-18 13:34:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
