package com.blognew.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

//    创建docket对象并用spring容器进行管理
//    docket是swagger中的全局配置对象
    @Bean

    public Docket docket(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2);

        ApiInfo apiInfo=new ApiInfoBuilder().contact(new Contact("BLOG","www","zcj")).title("Api文档").description("BLOG-Api文档").build();
        docket.apiInfo(apiInfo);
        return docket;
    }
}
