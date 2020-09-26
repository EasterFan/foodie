package com.easter.po;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * carousel
 *
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("轮播图 ")
public class Carousel implements Serializable {
    @ApiModelProperty("主键")
    @TableId
    private String id;

    @ApiModelProperty("图片 图片地址")
    private String imageUrl;

    @ApiModelProperty("背景色 背景颜色")
    private String backgroundColor;

    @ApiModelProperty("商品id 商品id")
    private String itemId;

    @ApiModelProperty("商品分类id 商品分类id")
    private String catId;

    @ApiModelProperty("轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    private Integer type;

    @ApiModelProperty("轮播图展示顺序 轮播图展示顺序，从小到大")
    private Integer sort;

    @ApiModelProperty("是否展示 是否展示，1：展示    0：不展示")
    private Integer isShow;

    @ApiModelProperty("创建时间 创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间 更新")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
