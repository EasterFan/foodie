package com.easter.po;

import com.baomidou.mybatisplus.annotation.TableId;
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
    @ApiModelProperty("主键id")
     @TableId
    private String id;

    @ApiModelProperty("归属订单id")
    private String orderId;

    @ApiModelProperty("商品id")
    private String itemId;

    @ApiModelProperty("商品图片")
    private String itemImg;

    @ApiModelProperty("商品名称")
    private String itemName;

    @ApiModelProperty("规格id")
    private String itemSpecId;

    @ApiModelProperty("规格名称")
    private String itemSpecName;

    @ApiModelProperty("成交价格")
    private Integer price;

    @ApiModelProperty("购买数量")
    private Integer buyCounts;

    private static final long serialVersionUID = 1L;
}
