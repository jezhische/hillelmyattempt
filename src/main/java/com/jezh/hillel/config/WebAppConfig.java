package com.jezh.hillel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Ежище on 13.07.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.jezh.hillel")
public class WebAppConfig extends WebMvcConfigurerAdapter {
}
