package com.easter.po;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * users
 *
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户表 ")
public class Users implements Serializable {
    @ApiModelProperty("主键id 用户id")
    @TableId
    private String id;

    @ApiModelProperty("用户名 用户名")
    private String username;

    @ApiModelProperty("密码 密码")
    private String password;

    @ApiModelProperty("昵称 昵称")
    private String nickname;

    @ApiModelProperty("真实姓名 真实姓名")
    private String realname;

    @ApiModelProperty("头像 头像")
    private String face;

    @ApiModelProperty("手机号 手机号")
    private String mobile;

    @ApiModelProperty("邮箱地址 邮箱地址")
    private String email;

    @ApiModelProperty("性别 性别 1:男  0:女  2:保密")
    private Integer sex;

    @ApiModelProperty("生日 生日")
    private LocalDate birthday;

    @ApiModelProperty("创建时间 创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间 更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
