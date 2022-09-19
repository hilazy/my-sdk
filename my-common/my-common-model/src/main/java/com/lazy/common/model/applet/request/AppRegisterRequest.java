package com.lazy.common.model.applet.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class AppRegisterRequest implements Serializable {

  /**
   * 用户名
   */
  private String username;

  /**
   * 密码
   */
  private String password;

  /**
   * 昵称
   */
  private String nickName;

  /**
   * 头像
   */
  private String avatar;

  /**
   * 手机号
   */
  private String phone;

  /**
   * 身份证号码
   */
  private String idCard;

  /**
   * 用户邮箱
   */
  private String email;


  /**
   * 微信用户Id
   */
  private  String wxUserId;

  /**
   * 备注
   */
  private String remark;

}
