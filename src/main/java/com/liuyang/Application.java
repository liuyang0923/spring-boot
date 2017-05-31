package com.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//设置项目端口(在appliaction.properties中设置了,不起作用)
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(9090);
	}
}