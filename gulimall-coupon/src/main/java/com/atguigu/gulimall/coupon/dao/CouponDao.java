package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author lambda
 * @email lambda@gmail.com
 * @date 2022-01-18 11:39:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
