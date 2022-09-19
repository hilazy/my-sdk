package com.lazy.common.model.applet.response;

import lombok.Data;

import java.io.Serializable;


@Data
public class AppLoginResponse implements Serializable {
  /**
   * 用户id
   */
  private Long id;

  /**
   * 用户token
   */
  private String token;

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



}
