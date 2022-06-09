package ru.irina.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.irina.spring")
@PropertySource("classpath:props.properties")
public class JavaConfig {
}
