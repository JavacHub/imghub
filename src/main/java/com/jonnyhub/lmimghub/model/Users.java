package com.jonnyhub.lmimghub.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-jonnyhub-lmimghub-model-Users")
@Data
@TableName(value = "lm_imghub_db.imghub_users")
public class Users implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户UID
     */
    @TableField(value = "`uid`")
    @ApiModelProperty(value="用户UID")
    private String uid;

    /**
     * 用户名，唯一
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名，唯一")
    private String username;

    /**
     * 用户邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="用户邮箱")
    private String email;

    /**
     * 用户密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="用户密码")
    private String password;

    /**
     * 用户注册IP
     */
    @TableField(value = "ip")
    @ApiModelProperty(value="用户注册IP")
    private String ip;

    /**
     * 用户注册UA
     */
    @TableField(value = "ua")
    @ApiModelProperty(value="用户注册UA")
    private String ua;

    /**
     * 注册时间
     */
    @TableField(value = "reg_time")
    @ApiModelProperty(value="注册时间")
    private Date regTime;

    /**
     * 最后登录时间
     */
    @TableField(value = "last_login")
    @ApiModelProperty(value="最后登录时间")
    private Date lastLogin;

    /**
     * 上传限制
     */
    @TableField(value = "up_limit")
    @ApiModelProperty(value="上传限制")
    private Integer upLimit;

    /**
     * 用户状态
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="用户状态")
    private String status;

    /**
     * 用户默认存储引擎
     */
    @TableField(value = "`storage`")
    @ApiModelProperty(value="用户默认存储引擎")
    private String storage;

    /**
     * 用户总上传数量
     */
    @TableField(value = "up_num")
    @ApiModelProperty(value="用户总上传数量")
    private Integer upNum;

    /**
     * 用户其它信息
     */
    @TableField(value = "`others`")
    @ApiModelProperty(value="用户其它信息")
    private String others;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_UID = "uid";

    public static final String COL_USERNAME = "username";

    public static final String COL_EMAIL = "email";

    public static final String COL_PASSWORD = "password";

    public static final String COL_IP = "ip";

    public static final String COL_UA = "ua";

    public static final String COL_REG_TIME = "reg_time";

    public static final String COL_LAST_LOGIN = "last_login";

    public static final String COL_UP_LIMIT = "up_limit";

    public static final String COL_STATUS = "status";

    public static final String COL_STORAGE = "storage";

    public static final String COL_UP_NUM = "up_num";

    public static final String COL_OTHERS = "others";
}