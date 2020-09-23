package com.easter.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * items_spec
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计")
public class ItemsSpec implements Serializable {
    /**
     * 商品规格id
     */
    @ApiModelProperty("商品规格id")
    private String id;

    /**
     * 商品外键id
     */
    @ApiModelProperty("商品外键id")
    private String itemId;

    /**
     * 规格名称
     */
    @ApiModelProperty("规格名称")
    private String name;

    /**
     * 库存
     */
    @ApiModelProperty("库存")
    private Integer stock;

    /**
     * 折扣力度
     */
    @ApiModelProperty("折扣力度")
    private BigDecimal discounts;

    /**
     * 优惠价
     */
    @ApiModelProperty("优惠价")
    private Integer priceDiscount;

    /**
     * 原价
     */
    @ApiModelProperty("原价")
    private Integer priceNormal;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createdTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
