package com.lazy.common.model.applet.response;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserInfoResponse implements Serializable {
  /**
   * 用户id
   */
  private Long id;

  /**
   * 昵称
   */
  private String nickName;

  /**
   * 头像
   */
  private String avatar;

  /**
   * 用户积分
   */
  private Integer userIntegral;

  /**
   * 微信用户Id
   */
  private  String wxUserId;

  /**
   * 方仓数量
   */
  private Integer sheltersNum;

  /**
   * 个人火警次数
   */
  private Integer personalFireNum;

  /**
   * 故障数
   */
  private Integer faultNum;

  /**
   * 我的设备
   */
  private String myDevice;
}
