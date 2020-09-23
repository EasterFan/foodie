package com.easter.mapper;

import com.easter.domain.Carousel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarouselMapper {
    int deleteByPrimaryKey(String id);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    Carousel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKey(Carousel record);
}
