package com.stacksimplify.restservices.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.stacksimplify.restservices.mappers.UserMapper;
import com.stacksimplify.restservices.mappers.UserMapperImpl;

@Configuration
@ComponentScan("com.stacksimplify.restservices.mappers.UserMapper")
public class AppConfig {
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

	@Bean
	public UserMapper userMapper()
	{
		return new UserMapperImpl();
	}
	
	
	
	
	
}
