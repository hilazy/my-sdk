package com.lazy.mongo.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD})
public @interface DefaultValue {
  String value();
}
