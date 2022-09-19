package com.lazy.mongo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
  _      __   ____  _
 | |    / /\   / / \ \_/
 |_|__ /_/--\ /_/_  |_|
 * @description 维护mongodb中其他集合的自增id
 * @author lazy
 * @date 2022/7/26
 **/
@Document
@Data
public class Incr {

    @Id
    private String _id;

    private String collectionName;

    private Long incrId;
}