package ioc_example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * This is the Configuration class to configure our project
 * To define/to tell Spring that this is the configuration class, we use @Configuration
 * @ComponentScan(basePackages = "ioc_example.spring.models") - it tells the Spring to go to the package and scan for 
 * @Component,  @Bean for it to create a bean of that class in the IOC container.
 */
@Configuration
@ComponentScan(basePackages = "ioc_example.spring.models")
public class AppConfig {

}
