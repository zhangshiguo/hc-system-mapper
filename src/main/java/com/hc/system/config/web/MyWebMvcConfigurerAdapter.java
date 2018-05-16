package com.hc.system.config.web;

import com.hc.system.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 创建人是: zsg 创建时间: 2018/3/23 0023.
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    /**
     * 配置静态访问资源
     * 自定义静态资源映射目录
     * 通过addResourceHandler添加映射路径，然后通过addResourceLocations来指定路径
     * addResourceLocations指的是文件放置的目录，addResoureHandler指的是对外暴露的访问路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
        //指定外部的目录也很简单，直接addResourceLocations指定即可
        //registry.addResourceHandler("/my/**").addResourceLocations("file:E:/my/");
        super.addResourceHandlers(registry);
    }


    /**
     * 以前要访问一个页面需要先创建个Controller控制类，再写方法跳转到页面
     * 在这里配置后就不需要那么麻烦了，直接访问http://localhost:8080/toLogin就跳转到login.jsp页面了
     * 在这里重写addViewControllers方法，并不会覆盖WebMvcAutoConfiguration中的addViewControllers（在此方法中，
     * Spring Boot将“/”映射至index.html），这也就意味着我们自己的配置和Spring Boot的自动配置同时有效
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
        super.addViewControllers(registry);
    }

    /**
     * 拦截器在我们项目中经常使用的，这里就来介绍下最简单的判断是否登录的使用。
     * 要实现拦截器功能需要完成以下2个步骤：
     * 创建我们自己的拦截器类并实现 HandlerInterceptor 接口
     * 其实重写WebMvcConfigurerAdapter中的addInterceptors方法把自定义的拦截器类添加进来即可
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        //registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/manage/list_area", "/manage/addarea", "/redis/test");
        //registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/manage/list_area");
        super.addInterceptors(registry);
    }
}
