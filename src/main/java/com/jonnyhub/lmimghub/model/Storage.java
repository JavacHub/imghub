package com.jonnyhub.lmimghub.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="com-jonnyhub-lmimghub-model-Storage")
@Data
@TableName(value = "lm_imghub_db.imghub_storage")
public class Storage implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 存储引擎的名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="存储引擎的名称")
    private String name;

    /**
     * 存储引擎，localhost：本地存储，
     */
    @TableField(value = "engine")
    @ApiModelProperty(value="存储引擎，localhost：本地存储，")
    private String engine;

    /**
     * 存储引擎绑定的域名
     */
    @TableField(value = "domains")
    @ApiModelProperty(value="存储引擎绑定的域名")
    private String domains;

    /**
     * 存储引擎的一些信息
     */
    @TableField(value = "info")
    @ApiModelProperty(value="存储引擎的一些信息")
    private String info;

    /**
     * 存储引擎开关，ON：打开，OFF：关闭
     */
    @TableField(value = "option_switch")
    @ApiModelProperty(value="存储引擎开关，ON：打开，OFF：关闭")
    private String optionSwitch;

    /**
     * 存储引擎的权重，0-99，权重越高，越靠前
     */
    @TableField(value = "weight")
    @ApiModelProperty(value="存储引擎的权重，0-99，权重越高，越靠前")
    private Byte weight;

    /**
     * 是否允许游客上传，1:允许,0:拒绝
     */
    @TableField(value = "permission")
    @ApiModelProperty(value="是否允许游客上传，1:允许,0:拒绝")
    private Boolean permission;

    /**
     * 其它信息
     */
    @TableField(value = "`others`")
    @ApiModelProperty(value="其它信息")
    private String others;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_ENGINE = "engine";

    public static final String COL_DOMAINS = "domains";

    public static final String COL_INFO = "info";

    public static final String COL_OPTION_SWITCH = "option_switch";

    public static final String COL_WEIGHT = "weight";

    public static final String COL_PERMISSION = "permission";

    public static final String COL_OTHERS = "others";
}