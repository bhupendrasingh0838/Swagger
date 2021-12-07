package com.swag.Swagger.Demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class BookConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Bhupendra APIs")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swag.Swagger.Demo"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Bhupendra APIs Page")
//                .select()
//              //  .apis(RequestHandlerSelectors.basePackage("com.swag.Swagger.Demo.Controller"))
//                .paths(regex("/book.*"))
//
//                .build()
//                .apiInfo(apiInfo());
//    }

   private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Library Management System")
                .description("Sample Documentation Generateed Using SWAGGER2 for our Library Management System Rest API")
               // .termsOfServiceUrl("https://www.oodlestechnologies.com/")
                .license("Dzone Swagger Article")
                .contact("Bhupendra Singh Yadav")
                .licenseUrl("https://dzone.com/articles/spring-boot-restful-api-documentation-with-swagger").version("1.0").build();
    }
    }

