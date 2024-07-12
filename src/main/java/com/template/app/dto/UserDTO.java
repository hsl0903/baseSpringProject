package com.template.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author Doug Liu
 * @since 2022-06-14
 */
@Data
@ApiModel(value = "用户信息")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Long id;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "用户性别")
    private Integer gender;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户状态")
    private Integer status;

    @ApiModelProperty(value = "用户角色")
    private String role;

    @ApiModelProperty(value = "用户创建时间")
    private Long createTime;

    @ApiModelProperty(value = "用户更新时间")
    private Long updateTime;

    @ApiModelProperty(value = "用户删除时间")
    private Long deleteTime;
    @ApiModelProperty(value = "用户删除标志")
    private Integer deleteFlag;

    @ApiModelProperty(value = "用户登录时间")
    private Long loginTime;

}