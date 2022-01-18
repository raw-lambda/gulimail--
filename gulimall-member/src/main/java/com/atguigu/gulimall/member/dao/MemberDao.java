package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lambda
 * @email lambda@gmail.com
 * @date 2022-01-18 13:11:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
