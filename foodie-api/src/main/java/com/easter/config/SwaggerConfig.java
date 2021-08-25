package com.easter.config;

import com.easter.constant.ConfigurationConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author EasterFan working on 2020/9/26 10:23 下午
 * @Description
 * @Version 1.0
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.easter.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description(ConfigurationConstants.SWAGGER_DESCRIPTION)
                .title(ConfigurationConstants.SWAGGER_TITLE)
                .version(ConfigurationConstants.SWAGGER_VERSION)
                .contact(new Contact("easter",
                        "localhost",
                        "easterfan@163.com"))
                .termsOfServiceUrl("localhost")
                .build();
    }
}

