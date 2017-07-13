package com.jezh.hillel.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Ежище on 13.07.2017.
 */
// http://devcolibri.com/3669
// избавляемся от web.xml:
//    <?xml version="1.0" encoding="UTF-8"?>
//            <web-app xmlns="http://java.sun.com/xml/ns/javaee"
//            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//            xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
//            http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
//            version="2.5">
//
//            <display-name>Archetype Created Web Application</display-name>
//
//            <context-param>
//            <param-name>contextConfigLocation</param-name>
//            <param-value>/WEB-INF/spring/spring-config-servlet.xml</param-value>
//            </context-param>
//            <listener>
//            <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//</listener>
//
//<servlet>
//<servlet-name>spring-config</servlet-name>
//<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//<init-param>
//<param-name>contextConfigLocation</param-name>
//<param-value></param-value>
//</init-param>
//<load-on-startup>1</load-on-startup>
//</servlet>
//<servlet-mapping>
//<servlet-name>spring-config</servlet-name>
//<url-pattern>/</url-pattern>
//</servlet-mapping>
//</web-app>
public class Initializer /*implements WebApplicationInitializer*/ {
    // Указываем имя нашему Servlet Dispatcher для мапинга
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

//    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        // Регистрируем в контексте конфигурационный класс, который мы создадим ниже
        ctx.register(WebAppConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));

        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME,
                new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
