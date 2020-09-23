package com.easter.mapper;

import com.easter.domain.ItemsParam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemsParamMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    ItemsParam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);
}
