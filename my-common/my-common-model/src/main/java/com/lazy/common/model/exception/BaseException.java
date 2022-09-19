package com.lazy.common.model.exception;

/**
 * @author metz
 * @date 2022-04-28 09:17
 */
public class BaseException extends RuntimeException{

  private static final long serialVersionUID = 1L;
  private final String message;

  @Override
  public String getMessage() {
    return message;
  }

  public BaseException(String message) {
    super(message);
    this.message = message;
  }

}
