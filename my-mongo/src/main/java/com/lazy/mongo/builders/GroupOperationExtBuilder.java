package com.lazy.mongo.builders;

import com.lazy.common.model.ext.ColumnUtil;
import com.lazy.common.model.ext.MyFunction;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
/**
 _      __   ____  _
 | |    / /\   / / \ \_/
 |_|__ /_/--\ /_/_  |_|
 * @description 分组构造器
 * @author lazy
 * @date 2022/7/27
 **/
public class GroupOperationExtBuilder {

  @Setter
  @Getter
  private GroupOperation groupOperation;

  public static GroupOperationExtBuilder build(GroupOperation group) {
    GroupOperationExtBuilder groupOperationBuilder = new GroupOperationExtBuilder();
    groupOperationBuilder.setGroupOperation(group);
    return groupOperationBuilder;
  }

  public GroupOperationExtBuilder count() {
    this.setGroupOperation(groupOperation.count().as("count"));
    return this;
  }

  public <T> GroupOperationExtBuilder sum(MyFunction<T, ?> function) {
    String fieldName = ColumnUtil.getFieldName(function,"-",2);
    this.setGroupOperation(groupOperation.sum(fieldName).as("sum"));
    return this;
  }

  public <T> GroupOperationExtBuilder avg(MyFunction<T, ?> function) {
    String fieldName = ColumnUtil.getFieldName(function,"-",2);
    this.setGroupOperation(groupOperation.avg(fieldName).as("avg"));
    return this;
  }

  public <T> GroupOperationExtBuilder max(MyFunction<T, ?> function) {
    String fieldName = ColumnUtil.getFieldName(function,"-",2);
    this.setGroupOperation(groupOperation.max(fieldName).as("max"));
    return this;
  }

  public <T> GroupOperationExtBuilder min(MyFunction<T, ?> function) {
    String fieldName = ColumnUtil.getFieldName(function,"-",2);
    this.setGroupOperation(groupOperation.min(fieldName).as("min"));
    return this;
  }
}
