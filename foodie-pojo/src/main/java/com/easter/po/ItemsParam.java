package com.easter.po;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * items_param
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品参数 ")
public class ItemsParam implements Serializable {
    @ApiModelProperty("商品参数id")
     @TableId
    private String id;

    @ApiModelProperty("商品外键id")
    private String itemId;

    @ApiModelProperty("产地 产地，例：中国江苏")
    private String producPlace;

    @ApiModelProperty("保质期 保质期，例：180天")
    private String footPeriod;

    @ApiModelProperty("品牌名 品牌名，例：三只大灰狼")
    private String brand;

    @ApiModelProperty("生产厂名 生产厂名，例：大灰狼工厂")
    private String factoryName;

    @ApiModelProperty("生产厂址 生产厂址，例：大灰狼生产基地")
    private String factoryAddress;

    @ApiModelProperty("包装方式 包装方式，例：袋装")
    private String packagingMethod;

    @ApiModelProperty("规格重量 规格重量，例：35g")
    private String weight;

    @ApiModelProperty("存储方法 存储方法，例：常温5~25°")
    private String storageMethod;

    @ApiModelProperty("食用方式 食用方式，例：开袋即食")
    private String eatMethod;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
