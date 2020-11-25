package com.easter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author EasterFan working on 2020/9/19 9:54 下午
 * @Description 启动类
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan("com.easter.mapper")
//@ComponentScan(basePackages = {"com.easter","org.n3r.idworker"})
public class FoodieApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodieApplication.class, args);
    }
}
