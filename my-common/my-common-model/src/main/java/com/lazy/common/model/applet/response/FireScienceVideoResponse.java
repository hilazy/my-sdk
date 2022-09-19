package com.lazy.common.model.applet.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 消防科普分类视频
 * Mongo实体类
 * </p>
 *
 * @author lazy
 * @since 2022-0915
 */
@Data
public class FireScienceVideoResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 视频类型(暂定)
     */
    private Integer type;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频副标题
     */
    private String subTitle;

    /**
     * 视频链接
     */
    private String videoUrl;

    /**
     * 视频描述
     */
    private String describe;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

}
