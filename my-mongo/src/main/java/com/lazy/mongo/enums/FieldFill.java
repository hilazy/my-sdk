package com.lazy.mongo.enums;
/**
  _      __   ____  _
 | |    / /\   / / \ \_/
 |_|__ /_/--\ /_/_  |_|
 * @description
 * @author lazy
 * @date 2022/9/8
 **/
public enum FieldFill {
    /**
     * 默认不处理
     */
    DEFAULT,
    /**
     * 插入时填充字段
     */
    INSERT,
    /**
     * 更新时填充字段
     */
    UPDATE,
    /**
     * 插入和更新时填充字段
     */
    INSERT_UPDATE
}