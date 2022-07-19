package com.sucurity.demo.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationContext implements ApplicationContextAware {

	private static ApplicationContext applicationcontext;

	@Override
	public void setApplicationContext(ApplicationContext ApplicationContext) throws BeansException {

		DemoApplicationContext.applicationcontext = ApplicationContext;

		System.out.println("Inside DemoApplicationContext" + ApplicationContext);

	}

	public static Object getBean(String name) {

		return applicationcontext.getBean(name);

	}

}
