package com.lazy.common.model.applet.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * Mongo实体类
 * </p>
 *
 * @author lazy
 * @since 2022-09-01
 */
@Data
public class InformationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

  /**
     * 资讯类型
     * 1.消防科普layout--分类视频
     * 2.智能方舱产品页--产品介绍页、文字，视频展示
     * 3.C端智能联动产品页--二级页-列表view-进入简介页面
     * 4.产品案例--二级页-列表view-进入简介页面
     * 5.行业信息--二级页-列表view-进入简介页面
     * 6.安全常识--二级页-列表view-进入简介页面
     * 7.商城(预留入口)--二级页-进入-临时建设页面(商城布局页)
     * 8.关于我们--二级页-进入-简介页面
     * 9.活动专区--列表view-进入-简介页面
     */
    private Integer type;

    /**
     * 子类型，没有子类型则为0
     */
    private Integer subType;

    /**
     * 资讯标题
     */
    private String title;

    /**
     * 资讯副标题
     */
    private String subTitle;

  /**
   * 视频链接
     */
    private String videoUrl;

  /**
   * 其他链接
     */
    private String linkUrl;
    /**
     * 资讯内容
     */
    private String content;

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
