package com.mile.mybatis.mappers;

import com.mile.mybatis.pojo.Empt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmptMapper {

    List<Empt> selectEmptById(@Param("id")Integer id);
    List<Empt> selectEmptById2(@Param("id")Integer id);
}
