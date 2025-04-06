//package com.mycompany.property_management.config;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//
//public class SwaggerConfig implements WebMvcConfigurer {
//
//    @Bean
//    public Docket appApi(){
//        Docket docket = new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.mycompany.property_management.controller"))
//                .paths((PathSelectors.regex("/.*"))).build();
//
//        return docket;
//    }
//
//}
