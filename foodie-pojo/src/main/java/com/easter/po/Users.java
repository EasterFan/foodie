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
 * users
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户表 ")
public class Users implements Serializable {
    /**
     * 主键id 用户id
     */
    @ApiModelProperty("主键id 用户id")
    private String id;

    /**
     * 用户名 用户名
     */
    @ApiModelProperty("用户名 用户名")
    private String username;

    /**
     * 密码 密码
     */
    @ApiModelProperty("密码 密码")
    private String password;

    /**
     * 昵称 昵称
     */
    @ApiModelProperty("昵称 昵称")
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    @ApiModelProperty("真实姓名 真实姓名")
    private String realname;

    /**
     * 头像 头像
     */
    @ApiModelProperty("头像 头像")
    private String face;

    /**
     * 手机号 手机号
     */
    @ApiModelProperty("手机号 手机号")
    private String mobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @ApiModelProperty("邮箱地址 邮箱地址")
    private String email;

    /**
     * 性别 性别 1:男  0:女  2:保密
     */
    @ApiModelProperty("性别 性别 1:男  0:女  2:保密")
    private Integer sex;

    /**
     * 生日 生日
     */
    @ApiModelProperty("生日 生日")
    private Date birthday;

    /**
     * 创建时间 创建时间
     */
    @ApiModelProperty("创建时间 创建时间")
    private Date createdTime;

    /**
     * 更新时间 更新时间
     */
    @ApiModelProperty("更新时间 更新时间")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}
