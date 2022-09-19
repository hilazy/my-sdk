package com.lazy.mongo.service;

import com.lazy.mongo.document.Incr;
import com.lazy.mongo.wrappers.MongoQueryWrapper;
import org.springframework.stereotype.Service;

/**
  _      __   ____  _
 | |    / /\   / / \ \_/
 |_|__ /_/--\ /_/_  |_|
 * @description 维护mongo集合的自增长id
 * @author lazy
 * @date 2022/7/27
 **/
@Service
public class IncrIdSrv extends BaseMongoSrv<Incr> {

  public  Long getIncrId(String collectionName){
    MongoQueryWrapper<Incr> build = MongoQueryWrapper.build(Incr.class);
    build.incr(Incr::getIncrId);
    build.eq(Incr::getCollectionName,collectionName);
    Incr incr = this.findAdnUpsertOneReturnNew(build);
    return incr.getIncrId();
  }
}
