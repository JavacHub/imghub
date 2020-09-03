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

@ApiModel(value = "com-jonnyhub-lmimghub-model-Images")
@Data
@TableName(value = "lm_imghub_db.imghub_images")
public class Images implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_IMGID = "imgid";
    public static final String COL_PATH = "path";
    public static final String COL_THUMB_PATH = "thumb_path";
    public static final String COL_STORAGE = "storage";
    public static final String COL_IP = "ip";
    public static final String COL_UA = "ua";
    public static final String COL_DATE = "date";
    public static final String COL_USER = "user";
    public static final String COL_COMPRESSION = "compression";
    public static final String COL_WATERMARK = "watermark";
    public static final String COL_LEVEL = "level";
    public static final String COL_OTHERS = "others";
    public static final String COL_TOKEN = "token";
    private static final long serialVersionUID = 1L;
    /**
     * 图片数字ID，自增
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "图片数字ID，自增")
    private Integer id;
    /**
     * 图片uid，唯一
     */
    @TableField(value = "imgid")
    @ApiModelProperty(value = "图片uid，唯一")
    private String imgid;
    /**
     * 图片路径
     */
    @TableField(value = "`path`")
    @ApiModelProperty(value = "图片路径")
    private String path;
    /**
     * 缩略图路径
     */
    @TableField(value = "thumb_path")
    @ApiModelProperty(value = "缩略图路径")
    private String thumbPath;
    /**
     * 存储引擎
     */
    @TableField(value = "`storage`")
    @ApiModelProperty(value = "存储引擎")
    private String storage;
    /**
     * 用户IP
     */
    @TableField(value = "ip")
    @ApiModelProperty(value = "用户IP")
    private String ip;
    /**
     * 用户UA
     */
    @TableField(value = "ua")
    @ApiModelProperty(value = "用户UA")
    private String ua;
    /**
     * 图片上传日期
     */
    @TableField(value = "`date`")
    @ApiModelProperty(value = "图片上传日期")
    private Date date;
    /**
     * 上传者，visitor:游客,admin:管理员
     */
    @TableField(value = "`user`")
    @ApiModelProperty(value = "上传者，visitor:游客,admin:管理员")
    private String user;
    /**
     * 图片是否压缩,0:未压缩,1:已压缩
     */
    @TableField(value = "compression")
    @ApiModelProperty(value = "图片是否压缩,0:未压缩,1:已压缩")
    private Byte compression;
    /**
     * 图片水印
     */
    @TableField(value = "watermark")
    @ApiModelProperty(value = "图片水印")
    private Byte watermark;
    /**
     * 图片等级，unknown:未识别，everyone:正常,adult:成人
     */
    @TableField(value = "`level`")
    @ApiModelProperty(value = "图片等级，unknown:未识别，everyone:正常,adult:成人")
    private String level;
    /**
     * 其它信息
     */
    @TableField(value = "`others`")
    @ApiModelProperty(value = "其它信息")
    private String others;
    /**
     * token，用于删除图片
     */
    @TableField(value = "token")
    @ApiModelProperty(value = "token，用于删除图片")
    private String token;
}