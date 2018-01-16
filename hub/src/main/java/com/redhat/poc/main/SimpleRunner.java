package com.redhat.poc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleRunner {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws InterruptedException {
		
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/camel-context.xml");
		Thread.currentThread().sleep(1000 * 60);

	}

}
