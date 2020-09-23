package com.easter.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order_items
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("订单商品关联表 ")
public class OrderItems implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private String id;

    /**
     * 归属订单id
     */
    @ApiModelProperty("归属订单id")
    private String orderId;

    /**
     * 商品id
     */
    @ApiModelProperty("商品id")
    private String itemId;

    /**
     * 商品图片
     */
    @ApiModelProperty("商品图片")
    private String itemImg;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String itemName;

    /**
     * 规格id
     */
    @ApiModelProperty("规格id")
    private String itemSpecId;

    /**
     * 规格名称
     */
    @ApiModelProperty("规格名称")
    private String itemSpecName;

    /**
     * 成交价格
     */
    @ApiModelProperty("成交价格")
    private Integer price;

    /**
     * 购买数量
     */
    @ApiModelProperty("购买数量")
    private Integer buyCounts;

    private static final long serialVersionUID = 1L;
}
