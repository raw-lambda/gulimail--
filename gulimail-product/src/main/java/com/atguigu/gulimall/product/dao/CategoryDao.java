package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lambda
 * @email lambda@gmail.com
 * @date 2022-01-15 13:24:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
