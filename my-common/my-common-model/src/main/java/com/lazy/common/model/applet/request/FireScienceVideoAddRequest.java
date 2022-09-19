package com.lazy.common.model.applet.request;

import lombok.Data;

import java.io.Serializable;

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
public class FireScienceVideoAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 备注
     */
    private String remark;

}
