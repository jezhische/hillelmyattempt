package com.jezh.hillel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Ежище on 13.07.2017.
 */
//Избавляемся от spring-config-servlet.xml
//    <?xml version="1.0" encoding="UTF-8"?>
//            <beans .....................>
//
//            <mvc:annotation-driven/>
//            <!--расположение статических ресурсов в classpath определяет тег location, а mapping определяет url, по которому
//            могут быть доступны статические ресурсы-->
//            <mvc:resources mapping="/resources/**" location="/static/"/>
//            <!--чтобы ПОДКЛЮЧИТЬ созданную jsp (index.jsp по умолчанию на запрос "/hmvc")-->
//            <mvc:view-controller path="/" view-name="user_check_page"/>
//
//            <context:annotation-config/>
//            <context:component-scan base-package="com.jezh.hillel"/>
//            <!--<bean class="com.acme.AppConfig"/>-->
//
//<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"
//        p:prefix="/WEB-INF/pages/" p:suffix=".jsp"/>
//<!--<property name="prefix" value="/WEB-INF/pages/"/>-->
//<!--<property name="suffix" value=".jsp"/>-->
//<!--</bean>-->
//</beans>
@Configuration
@EnableWebMvc
//@PropertySource("classpath:controller.properties")
@ComponentScan("com.jezh.hillel")
public class WebAppConfig extends WebMvcConfigurerAdapter {
    // Позволяет видеть все ресурсы в папке static, такие как картинки, стили и т.п.
    //Stores registrations of resource handlers for serving static resources such as images,
    // css files and others through Spring MVC
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/static/");
    }

    // а этот бин инициализирует View нашего проекта
    // точно это же мы делали в spring-config-servlet.xml
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

}
