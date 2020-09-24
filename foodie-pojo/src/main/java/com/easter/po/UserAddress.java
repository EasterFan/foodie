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
 * user_address
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户地址表 ")
public class UserAddress implements Serializable {
    @ApiModelProperty("地址主键id")
    private String id;

    @ApiModelProperty("关联用户id")
    private String userId;

    @ApiModelProperty("收件人姓名")
    private String receiver;

    @ApiModelProperty("收件人手机号")
    private String mobile;

    @ApiModelProperty("省份")
    private String province;

    @ApiModelProperty("城市")
    private String city;

    @ApiModelProperty("区县")
    private String district;

    @ApiModelProperty("详细地址")
    private String detail;

    @ApiModelProperty("扩展字段")
    private String extand;

    @ApiModelProperty("是否默认地址 1:是  0:否")
    private Integer isDefault;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
