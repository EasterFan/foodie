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
 * items_comments
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品评价表 ")
public class ItemsComments implements Serializable {
    /**
     * id主键
     */
    @ApiModelProperty("id主键")
    private String id;

    /**
     * 用户id 用户名须脱敏
     */
    @ApiModelProperty("用户id 用户名须脱敏")
    private String userId;

    /**
     * 商品id
     */
    @ApiModelProperty("商品id")
    private String itemId;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String itemName;

    /**
     * 商品规格id 可为空
     */
    @ApiModelProperty("商品规格id 可为空")
    private String itemSpecId;

    /**
     * 规格名称 可为空
     */
    @ApiModelProperty("规格名称 可为空")
    private String sepcName;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @ApiModelProperty("评价等级 1：好评 2：中评 3：差评")
    private Integer commentLevel;

    /**
     * 评价内容
     */
    @ApiModelProperty("评价内容")
    private String content;

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
