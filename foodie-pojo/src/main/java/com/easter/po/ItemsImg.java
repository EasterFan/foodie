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
 * items_img
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品图片 ")
public class ItemsImg implements Serializable {
    /**
     * 图片主键
     */
    @ApiModelProperty("图片主键")
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @ApiModelProperty("商品外键id 商品外键id")
    private String itemId;

    /**
     * 图片地址 图片地址
     */
    @ApiModelProperty("图片地址 图片地址")
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    @ApiModelProperty("顺序 图片顺序，从小到大")
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @ApiModelProperty("是否主图 是否主图，1：是，0：否")
    private Integer isMain;

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
