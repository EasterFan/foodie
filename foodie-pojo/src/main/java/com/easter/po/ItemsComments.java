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
 * items_comments
 *
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品评价表 ")
public class ItemsComments implements Serializable {
    @ApiModelProperty("id主键")
    @TableId
    private String id;

    @ApiModelProperty("用户id 用户名须脱敏")
    private String userId;

    @ApiModelProperty("商品id")
    private String itemId;

    @ApiModelProperty("商品名称")
    private String itemName;

    @ApiModelProperty("商品规格id 可为空")
    private String itemSpecId;

    @ApiModelProperty("规格名称 可为空")
    private String sepcName;

    @ApiModelProperty("评价等级 1：好评 2：中评 3：差评")
    private Integer commentLevel;

    @ApiModelProperty("评价内容")
    private String content;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
