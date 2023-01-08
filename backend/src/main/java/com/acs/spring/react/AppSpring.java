package com.acs.spring.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * REST Controller which serves as an entry-point for requests for prime number information.
 *
 * @author kris.foster@oracle.com
 */
@SpringBootApplication
@EnableScheduling
public class AppSpring {


    @Configuration
    public class WebConfiguration implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH").allowedHeaders("X-Total-Count").exposedHeaders("X-Total-Count");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(AppSpring.class, args);
    }
}
