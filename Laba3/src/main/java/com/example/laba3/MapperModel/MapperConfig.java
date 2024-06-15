package com.example.laba3.MapperModel;

import org.modelmapper.*;
import org.springframework.context.annotation.*;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        return new ModelMapper();
    }
}
