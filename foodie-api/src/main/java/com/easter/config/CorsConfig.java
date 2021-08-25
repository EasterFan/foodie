package com.easter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author EasterFan working on 2021/8/25 3:33 PM
 * @Description 跨域配置
 * @Version 1.0
 */
@Configuration
public class CorsConfig {
    public CorsConfig() {

    }

    @Bean
    public CorsFilter corsFilter() {
        // 1. 添加 cors 配置信息
        CorsConfiguration configuration = new CorsConfiguration();
        // 前端的地址
        configuration.addAllowedOrigin("http://localhost");

        // 设置是否发送 cookie 信息 - 和前端的 axios 保持一致
        configuration.setAllowCredentials(true);
        configuration.addAllowedMethod("*");
        configuration.addAllowedHeader("*");

        // 2. 为 url 添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", configuration);

        return new CorsFilter(corsSource);
    }
}
