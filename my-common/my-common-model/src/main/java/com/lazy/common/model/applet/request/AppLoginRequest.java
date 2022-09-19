package com.lazy.common.model.applet.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class AppLoginRequest implements Serializable {
  private String username;
  private String password;
}
