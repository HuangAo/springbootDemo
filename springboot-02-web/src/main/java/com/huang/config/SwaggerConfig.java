package com.huang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author :huangao
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
   public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                   .apiInfo(apiInfo())
                   .groupName("huang")
                   .select()
                   .apis(RequestHandlerSelectors.basePackage("com.huang.controller"))
                   .build();
    }

    private ApiInfo apiInfo(){
       return new ApiInfo("Huang Api Documentation",
                     "Huang Ao's Api Documentation",
                     "1.0", "urn:tos",
                     new Contact("HuangAO", "", "huanga23@163.com"),
                    "Apache 2.0",
                    "http://www.apache.org/licenses/LICENSE-2.0",
                     new ArrayList());
    }
}
