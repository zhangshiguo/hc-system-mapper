package com.hc.system.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 创建人是: zsg 创建时间: 2018/3/2 0002.
 */

//
//注解说明：
//
//@Api：用在类上，说明该类的作用
//@ApiOperation：用在方法上，说明方法的作用
//@ApiImplicitParams：用在方法上包含一组参数说明
//@ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
//        paramType：参数放在哪个地方
//        header-->请求参数的获取：@RequestHeader
//        query-->请求参数的获取：@RequestParam
//        path（用于restful接口）-->请求参数的获取：@PathVariable
//        body（不常用）
//        form（不常用）
//        name：参数名
//        dataType：参数类型
//        required：参数是否必须传
//        value：参数的意思
//        defaultValue：参数的默认值
//@ApiResponses：用于表示一组响应
//@ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
//        code：数字，例如400
//        message：信息，例如"请求参数没填好"
//        response：抛出异常的类
//@ApiModel：描述一个Model的信息（这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
//@ApiModelProperty：描述一个model的属性



//swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
//最常用的5个注解
//@Api：修饰整个类，描述Controller的作用
//@ApiOperation：描述一个类的一个方法，或者说一个接口
//@ApiParam：单个参数描述
//@ApiModel：用对象来接收参数
//@ApiProperty：用对象接收参数时，描述对象的一个字段
//其它若干
//@ApiResponse：HTTP响应其中1个描述
//@ApiResponses：HTTP响应整体描述
//@ApiIgnore：使用该注解忽略这个API
//Swagger2默认将所有的Controller中的RequestMapping方法都会暴露，然而在实际开发中，我们并不一定需要把所有API都提现在文档中
//        查看，这种情况下，使用注解@ApiIgnore来解决，如果应用在Controller范围上，则当前Controller中的所有方法都会被忽略，
//        如果应用在方法上，则对应用的方法忽略暴露API。
//@ApiError ：发生错误返回的信息
//@ApiParamImplicitL：一个请求参数
//@ApiParamsImplicit 多个请求参数

@Configuration
// 启用Swagger2
@EnableSwagger2
public class Swagger2Configuration {

    @Value("${swagger.show}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hc.system.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restfun风格")
                .termsOfServiceUrl("http://blog.csdn.net/forezp")
                .version("1.0")
                .build();
    }
}





