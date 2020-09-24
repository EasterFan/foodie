package com.easter.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * items
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表")
public class Items implements Serializable {
    @ApiModelProperty("商品主键id")
    private String id;

    @ApiModelProperty("商品名称 商品名称")
    private String itemName;

    @ApiModelProperty("分类外键id 分类id")
    private Integer catId;

    @ApiModelProperty("一级分类外键id 一级分类id，用于优化查询")
    private Integer rootCatId;

    @ApiModelProperty("累计销售 累计销售")
    private Integer sellCounts;

    @ApiModelProperty("上下架状态 上下架状态,1:上架 2:下架")
    private Integer onOffStatus;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间")
    private Date updatedTime;

    @ApiModelProperty("商品内容 商品内容")
    private String content;

    private static final long serialVersionUID = 1L;
}
