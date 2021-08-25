package com.easter.controller;

import com.easter.api.CommonResult;
import com.easter.service.CarouselService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author EasterFan working on 2020/10/15 7:31 下午
 * @Description
 * @Version 1.0
 */
@Api(value = "轮播图", tags = {"用于轮播图相关接口"})
@RestController
@RequestMapping("carousel")
public class CarouselController {
    @Autowired
    CarouselService carouselService;

    @ApiOperation(value = "获取所有轮播图地址", notes = "获取所有轮播图地址", httpMethod = "GET")
    @GetMapping()
    public CommonResult allCarousel() {
        return CommonResult.success(carouselService.carouselList());
    }

}
