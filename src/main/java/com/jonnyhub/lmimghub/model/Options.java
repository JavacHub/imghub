package com.jonnyhub.lmimghub.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-jonnyhub-lmimghub-model-Options")
@Data
@TableName(value = "lm_imghub_db.imghub_options")
public class Options implements Serializable {
    public static final  String  COL_ID            = "id";
    public static final  String  COL_NAME          = "name";
    public static final  String  COL_VALUES        = "values";
    public static final  String  COL_OPTION_SWITCH = "option_switch";
    private static final long    serialVersionUID  = 1L;
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private              Integer id;
    /**
     * 选项名称，唯一
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "选项名称，唯一")
    private              String  name;
    /**
     * 选项值，多项可存储json
     */
    @TableField(value = "`values`")
    @ApiModelProperty(value = "选项值，多项可存储json")
    private              String  values;
    /**
     * 选项开关，ON:打开;OFF:关闭（默认）
     */
    @TableField(value = "option_switch")
    @ApiModelProperty(value = "选项开关，ON:打开;OFF:关闭（默认）")
    private              String  optionSwitch;
}