package com.easter.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easter.mapper.CarouselMapper;
import com.easter.po.Carousel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author EasterFan working on 2020/10/15 7:36 下午
 * @Description
 * @Version 1.0
 */
@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements CarouselService {
    @Override
    public List<Carousel> carouselList() {
        return null;
    }
}
