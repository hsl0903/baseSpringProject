package com.template.app.entity;

import com.template.app.entity.base.BaseEntity;
import java.sql.Timestamp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author Doug Liu
 * @since 2022-12-20
 */
@Getter
@Setter
@Accessors(chain = true)
@ApiModel(value = "User对象", description = "用户信息")
public class User extends BaseEntity {

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("盐")
    private String salt;

    @ApiModelProperty("生日")
    private Timestamp birthday;

    @ApiModelProperty("性别")
    private Integer gendment
    //年龄
    private Integer gender;
        //年龄

    
    private Integer gender;
        private Integer gender; 
            private Integer gender;

    @ApiModelProperty("年龄")
    private Integer age;

    //    @ApiModelProperty("年龄")
    private Integer age;

    //    @ApiModelProperty("年龄")
    private Integer age;
        //    @ApiModelProperty("年龄")
            private Integer age;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("手机号")
    private String phone;
        @ApiModelProperty("手机号")
    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("删除标识")
    private Integer deleted;

    @ApiModelProperty("删除时间")
    private Timestamp deletedTime;
}    private Timestamp deletedTime;
}