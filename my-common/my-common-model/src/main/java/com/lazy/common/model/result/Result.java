package com.lazy.common.model.result;

import fire.control.common.model.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 自定义结果集
 */
@Data
public class Result<T> implements Serializable {

  /*序列化标识*/
  private static final long serialVersionUID = 1L;

  /*业务代码*/
  private Integer code;
  /*提示语*/
  private String message;
  /*数据*/
  private T data;

  public Result() {

  }

  public Result(Integer code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public Result(String message, T data) {
    this.message = message;
    this.data = data;
    this.code = 200;
  }

  public static Result<?> success() {
    return Result.success(null);
  }

  public static Result<?> error(ErrorCode errorCode) {
    return new Result(errorCode.getCode(), errorCode.getMessage(), null);
  }

  public static Result<?> error(String errorMsg) {
    return new Result(500, errorMsg, null);
  }


  public static <T> Result<?> success(T data) {
    return new Result("success", data);
  }

  /**
   * 自定义成功 message信息
   */
  public static <T> Result<?> successMsg(String message, T data) {
    return new Result(200, message, data);
  }

  /**
   * 自定义成功 message信息
   */
  public static <T> Result<?> successMsg(String message) {
    return successMsg(message, null);
  }
}
