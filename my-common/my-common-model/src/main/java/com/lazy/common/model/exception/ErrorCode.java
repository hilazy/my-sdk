package com.lazy.common.model.exception;

/**
 业务逻辑返回代码
 */
public enum ErrorCode {

  /**
   * 2XXX
   */
  SUCCESS( 200, "success", "success"),
  USER_NOT_LOGIN( 401, "用户尚未登录", "user.not.login"),
  USER_NOT_PERMISSION( 403, "用户没有权限", "user.not.permission"),
  DATA_NOT_FOUND( 4404, "数据对象-{} 未找到 {}", "data.not.found"),

  /**
   * 300XXX 用户相关
   */
  USER_NOT_FOUND( 300001, "用户不存在", "user.not.found"),
  OperationTooFrequently( 300002, "处理中请稍候!", "operation.too.frequently"),
  WrongUsernameOrPassword( 300003, "用户名或密码错误", "Wrong.Username.Or.Password"),
  USER_HAS_EXIST( 300004, "用户已经存在", "user.has.exist"),
  PARAM_NOT_VALID_EXCEPTION( 4000, "参数校验失败", "param.not.valid"),

  /**
   * 302XXX 后台用户相关
   */
  ADMIN_NOT_FOUND( 302000, "用户未找到", "admin.not.fund"),
  ADMIN_STATUS_DISABLED( 302001, "用户已被禁用", "admin.status.disabled"),
  ADMIN_PWD_EMPTY( 302002, "用户未设置密码", "admin.password.empty"),
  ADMIN_PWD_ERROR( 302003, "密码错误", "admin.password.error"),


  /**
   * 400XXX 系统相关
   */
  SYSTEM_ERROR( 400001, "系统错误", "system.error"),
  SYSTEM_PARAMETER_ERROR( 400002, "参数错误", "system.parameter.error"),
  OVER( 0, "over", "over");

  private Boolean isi18n;

  private Integer code;
  private String message;
  private String i18nCode;

  ErrorCode(Integer code, String message, String i18nCode) {
    this.code = code;
    this.message = message;
    this.i18nCode = i18nCode;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getI18nCode() {
    return i18nCode;
  }

  public void setI18nCode(String i18nCode) {
    this.i18nCode = i18nCode;
  }
}
