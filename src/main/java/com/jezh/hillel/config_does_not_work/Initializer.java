package com.jezh.hillel.config_does_not_work;

/**
 * Created by Ежище on 13.07.2017.
 */
// http://devcolibri.com/3669
// избавляемся от web.xml:
//    <?xml version="1.0" encoding="UTF-8"?>
//<web-app............................>
//<context-param>
//    <param-name>contextConfigLocation</param-name>
//    <param-value>/WEB-INF/spring/spring-config_does_not_work-servlet.xml</param-value>
//</context-param>
//<listener>
//    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//</listener>
//
//<servlet>
//    <servlet-name>spring-config_does_not_work</servlet-name>
//    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//    <init-param>
//        <param-name>contextConfigLocation</param-name>
//        <param-value></param-value>
//    </init-param>
//    <load-on-startup>1</load-on-startup>
//</servlet>
//<servlet-mapping>
//    <servlet-name>spring-config_does_not_work</servlet-name>
//    <url-pattern>/</url-pattern>
//</servlet-mapping>
//</web-app>
public class Initializer /*implements WebApplicationInitializer */{
//    // Указываем имя нашему Servlet Dispatcher для мапинга
//    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
//
//    @Override
//    public void onStartup(ServletContext container) throws ServletException {
//        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//
//        // Регистрируем в контексте конфигурационный класс, который мы создадим ниже
//        rootContext.register(WebAppConfig.class);
//        container.addListener(new ContextLoaderListener(rootContext));
//
//        rootContext.setServletContext(container);
//
//        ServletRegistration.Dynamic servlet = container.addServlet(DISPATCHER_SERVLET_NAME,
//                new DispatcherServlet(rootContext));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);
//    }

//    @Override
//    //Called first when the application starts loading.
//    public void onStartup(ServletContext container) throws ServletException {
//        // Create the 'root' Spring application context
//        AnnotationConfigWebApplicationContext rootContext =
//                new AnnotationConfigWebApplicationContext();
//        // регистрируем в созданном rootContext его конфигурацию (WebAppConfig - отдельный файл с конфигурацией):
//        rootContext.register(WebAppConfig.class);
//
//        // Manage the lifecycle of the root application context
//        container.addListener(new ContextLoaderListener(rootContext));
//
//        // Create the dispatcher servlet's Spring application context
//        AnnotationConfigWebApplicationContext dispatcherContext =
//                new AnnotationConfigWebApplicationContext();
//        dispatcherContext.register(DispatcherConfig.class);
//
//        // Register and map the dispatcher servlet
//        ServletRegistration.Dynamic dispatcher =
//                container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");
//    }
}
