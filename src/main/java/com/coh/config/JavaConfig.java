package com.coh.config;

import com.coh.pojo.Cup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(name = "myCup")
    public Cup cup(){
        return new Cup();
    }
}
