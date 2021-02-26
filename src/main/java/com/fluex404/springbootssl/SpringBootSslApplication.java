package com.fluex404.springbootssl;

import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.naming.Context;

@SpringBootApplication
public class SpringBootSslApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSslApplication.class, args);
	}
	
}
