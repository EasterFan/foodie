package com.easter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.easter.po.Carousel;

import java.util.List;

/**
 * @Author EasterFan working on 2020/10/15 7:34 下午
 * @Description
 * @Version 1.0
 */

public interface CarouselService extends IService<Carousel> {
    List<Carousel> carouselList();
}
