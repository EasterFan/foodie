package com.easter.mapper;

import com.easter.domain.ItemsImg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemsImgMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsImg record);

    int insertSelective(ItemsImg record);

    ItemsImg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsImg record);

    int updateByPrimaryKey(ItemsImg record);
}
