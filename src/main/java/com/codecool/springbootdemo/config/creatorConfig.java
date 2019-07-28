package com.codecool.springbootdemo.config;

import com.codecool.springbootdemo.service.DogCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class creatorConfig {

    @Bean
    public DogCreator creator1() {
        return new DogCreator();
    }

    @Bean(name = "helloCreator")
    public DogCreator creator2() {
        return new DogCreator();
    }
}
