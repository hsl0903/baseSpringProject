package com.template.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户登录信息
 *
 * @author Doug Liu
 * @since 2022-06-14
 */
@Data
@ApiModel(value = "用户登录信息", description = "用户登录信息")
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Long id;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "权限")
    private String roleId;

    @ApiModelProperty(value = "用户是否已完善资料(true需要补充 false已完善)")
    private Boolean checkUserInfo;

    @ApiModelProperty(value = "菜单列表")
    private String menuList;

    @ApiModelProperty(value = "接口列表")
    private List<String> apiList;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "用户手机号")
        private String phone;

    @ApiModelProperty(value = "用户邮箱")
    private String email;
    @ApiModelProperty(value = "用户性别(0:未知 1:男 2:女)")
    private Integer gender;

    @ApiModelProperty(value = "用户状态(0:禁用 1:正常)")
    private Integer status;

    @ApiModelProperty(value = "用户类型(0:普通用户 1:后台管理员)")
    private Integer type;
        @ApiModelProperty(value = "用户是否删除(0:未删除 1:已删除)")
        private Integer isDelete;

    @ApiModelProperty(value = "用户创建时间")
    private Long createTime;
        @ApiModelProperty(value = "用户更新时间")
        private Long updateTime;

    @ApiModelProperty(value = "用户密码")
    private String password;

        @ApiModelProperty(value = "用户盐值")
        private String salt;

    @ApiModelProperty(value = "用户登录IP")
    private String loginIp;
        @ApiModelProperty(value = "用户登录时间")
        private Long loginTime;

    @ApiModelProperty(value = "用户登录设备")
    private String loginDevice;
        @ApiModelProperty(value = "用户登录地区")
        private String loginArea;
            @ApiModelProperty(value = "用户登录地区")
        @ApiModelProperty(value = "用户登录地区")
        private String loginArea;
            @ApiModelProperty(value = "用户登录地区")
            private String loginArea;

    

    







}