package com.example.classifieds.glue;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(includeFilters = {@Filter(Repository.class), @Filter(Service.class), @Filter(Component.class)},
	basePackages = {"com.example.classifieds.glue",
			"com.example.classifieds.realestate.repositories","com.example.classifieds.realestate.handlers"})
public class GlueConfiguration {

}
