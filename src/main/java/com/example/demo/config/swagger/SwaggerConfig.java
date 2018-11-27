package com.example.demo.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: chenpan
 * @description: swagger
 * @author: chenp
 * @create: 2018-11-15 14:10
 **/
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"com.example.demo.controller"})
public class SwaggerConfig {
    @Bean
    public Docket createRestAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("this is chen pan first  swagger2 build ")
                .description("我写的swagger 文档")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }


}