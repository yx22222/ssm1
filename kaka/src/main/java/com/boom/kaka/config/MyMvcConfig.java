package com.boom.kaka.config;


import com.boom.kaka.component.LoginHandlerInterceptor;
import com.boom.kaka.component.MylocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



/**
 * @Auther:yx
 * @Date:2020/6/11
 * @Description:com.thymeleaf.springbootthymeleaf.config
 * @version:1.0
 */
//使用WebMvcConfigurationSupport可以来扩展SpringMVC的功能
//@Configuration
//public class MyMvcConfig extends WebMvcConfigurationSupport{
//    @Override
//    protected void addViewControllers(ViewControllerRegistry registry) {
//        //super.addViewControllers(registry);
//        //浏览器发送/atyx请求 来到success页面
//    registry.addViewController("/atyx").setViewName("success");
//    }
//}
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{
    @Bean
    public LocaleResolver localeResolver(){
         return new MylocaleResolver();
     }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
        registry.addViewController("/adminmain.html").setViewName("adminboard");
        registry.addViewController("/admin").setViewName("adminLogin");
    }
//注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/user/login","/asserts/**","/admin/login","/admin");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}