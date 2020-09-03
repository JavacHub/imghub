package com.jonnyhub.lmimghub.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-jonnyhub-lmimghub-model-Invite")
@Data
@TableName(value = "lm_imghub_db.imghub_invite")
public class Invite implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_INVITE_CODE = "invite_code";
    public static final String COL_CREAT_TIME = "creat_time";
    public static final String COL_EXP_TIME = "exp_time";
    public static final String COL_EMAIL = "email";
    public static final String COL_STATUS = "status";
    public static final String COL_OTHERS = "others";
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;
    /**
     * 邀请码
     */
    @TableField(value = "invite_code")
    @ApiModelProperty(value = "邀请码")
    private String inviteCode;
    /**
     * 邀请码创建时间
     */
    @TableField(value = "creat_time")
    @ApiModelProperty(value = "邀请码创建时间")
    private Date creatTime;
    /**
     * 邀请码过期时间
     */
    @TableField(value = "exp_time")
    @ApiModelProperty(value = "邀请码过期时间")
    private Date expTime;
    /**
     * 用户邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "用户邮箱")
    private String email;
    /**
     * 邀请码状态
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "邀请码状态")
    private String status;
    /**
     * 其它信息
     */
    @TableField(value = "`others`")
    @ApiModelProperty(value = "其它信息")
    private String others;
}