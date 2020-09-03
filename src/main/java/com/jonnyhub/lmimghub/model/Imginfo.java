package com.jonnyhub.lmimghub.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-jonnyhub-lmimghub-model-Imginfo")
@Data
@TableName(value = "lm_imghub_db.imghub_imginfo")
public class Imginfo implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_IMGID = "imgid";
    public static final String COL_MIME = "mime";
    public static final String COL_WIDTH = "width";
    public static final String COL_HEIGHT = "height";
    public static final String COL_VIEWS = "views";
    public static final String COL_EXT = "ext";
    public static final String COL_CLIENT_NAME = "client_name";
    public static final String COL_TAGS = "tags";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_SIZE = "size";
    private static final long serialVersionUID = 1L;
    /**
     * 图片信息id，自增
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "图片信息id，自增")
    private Integer id;
    /**
     * 图片uid，唯一，和images.imgid关联
     */
    @TableField(value = "imgid")
    @ApiModelProperty(value = "图片uid，唯一，和images.imgid关联")
    private String imgid;
    /**
     * 图片MIME类型
     */
    @TableField(value = "mime")
    @ApiModelProperty(value = "图片MIME类型")
    private String mime;
    /**
     * 图片宽
     */
    @TableField(value = "width")
    @ApiModelProperty(value = "图片宽")
    private Double width;
    /**
     * 图片高
     */
    @TableField(value = "height")
    @ApiModelProperty(value = "图片高")
    private Double height;
    /**
     * 图片浏览次数
     */
    @TableField(value = "views")
    @ApiModelProperty(value = "图片浏览次数")
    private Integer views;
    /**
     * 图片扩展名
     */
    @TableField(value = "ext")
    @ApiModelProperty(value = "图片扩展名")
    private String ext;
    /**
     * 图片原始文件名
     */
    @TableField(value = "client_name")
    @ApiModelProperty(value = "图片原始文件名")
    private String clientName;
    /**
     * 图片标签
     */
    @TableField(value = "tags")
    @ApiModelProperty(value = "图片标签")
    private String tags;
    /**
     * 图片描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value = "图片描述")
    private String description;
    /**
     * 图片大小，单位kb
     */
    @TableField(value = "`size`")
    @ApiModelProperty(value = "图片大小，单位kb")
    private Double size;
}