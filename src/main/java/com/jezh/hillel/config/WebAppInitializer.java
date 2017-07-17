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
//<web-app............................>
//<context-param>
//    <param-name>contextConfigLocation</param-name>
//    <param-value>/WEB-INF/spring/spring-config-servlet.xml</param-value>
//</context-param>
//<listener>
//    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//</listener>
//
//<servlet>
//    <servlet-name>spring-config</servlet-name>
//    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//    <init-param>
//        <param-name>contextConfigLocation</param-name>
//        <param-value></param-value>
//    </init-param>
//    <load-on-startup>1</load-on-startup>
//</servlet>
//<servlet-mapping>
//    <servlet-name>spring-config</servlet-name>
//    <url-pattern>/</url-pattern>
//</servlet-mapping>
//</web-app>
public class WebAppInitializer implements WebApplicationInitializer {
    // Указываем имя нашему Servlet Dispatcher для мапинга
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext containerCommunicationMethods) throws ServletException {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        // Регистрируем в контексте конфигурационный класс, который мы создадим ниже
        rootContext.register(WebAppConfig.class);
        // Manage the lifecycle of the root application context
        containerCommunicationMethods.addListener(new ContextLoaderListener(rootContext));
        // ???
        rootContext.setServletContext(containerCommunicationMethods);

        // Create the dispatcher servlet's Spring application context
//        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
//        dispatcherContext.register(DispatcherConfig.class);

        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic servlet = containerCommunicationMethods.addServlet(DISPATCHER_SERVLET_NAME,
                new DispatcherServlet(rootContext)); // ....new DispatcherServlet(dispatcherContext));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
