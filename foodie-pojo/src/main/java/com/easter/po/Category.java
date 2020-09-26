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
 * category
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品分类 ")
public class Category implements Serializable {
    @ApiModelProperty("主键 分类id主键")
    @TableId
    private String id;

    @ApiModelProperty("分类名称 分类名称")
    private String name;

    @ApiModelProperty("分类类型 分类得类型， 1:一级大分类 2:二级分类 3:三级小分类")
    private Integer type;

    @ApiModelProperty("父id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级")
    private Integer fatherId;

    @ApiModelProperty("图标 logo")
    private String logo;

    @ApiModelProperty("口号")
    private String slogan;

    @ApiModelProperty("分类图")
    private String catImage;

    @ApiModelProperty("背景颜色")
    private String bgColor;

    private static final long serialVersionUID = 1L;
}
