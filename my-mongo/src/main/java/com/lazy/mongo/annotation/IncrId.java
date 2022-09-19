package com.lazy.mongo.annotation;

import java.lang.annotation.*;
/**
  _      __   ____  _
 | |    / /\   / / \ \_/
 |_|__ /_/--\ /_/_  |_|
 * @description 标识自增id(类型long)
 * @author lazy
 * @date 2022/9/8
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD})
public @interface IncrId {

}
