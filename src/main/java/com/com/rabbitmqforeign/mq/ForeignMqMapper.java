package com.com.rabbitmqforeign.mq;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ForeignMqMapper {

    @Insert("insert into foreign values (#{message})")
    void insert(String message);
}
