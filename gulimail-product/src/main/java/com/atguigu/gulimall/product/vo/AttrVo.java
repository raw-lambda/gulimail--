package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.AttrEntity;
import lombok.Data;

@Data
public class AttrVo extends AttrEntity {
    /**
     * 分组id
     */
    private Long attrGroupId;
}
