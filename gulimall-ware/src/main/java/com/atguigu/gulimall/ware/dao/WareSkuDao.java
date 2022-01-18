package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lambda
 * @email lambda@gmail.com
 * @date 2022-01-18 13:59:10
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
