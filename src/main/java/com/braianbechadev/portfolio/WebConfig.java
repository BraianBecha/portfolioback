
package com.braianbechadev.portfolio;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@EnableWebMvc
@Configuration

public class WebConfig implements WebMvcConfigurer{
     @Override

    /**
     *
     * @param registry
     */
    
    // @Override
    public void addCorsMapping(CorsRegistry registry){
        registry.addMapping("/**");
    }
}

