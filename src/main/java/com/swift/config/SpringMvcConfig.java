package com.swift.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.swift.controller","com.swift.config"})
@EnableWebMvc
public class SpringMvcConfig{
}
