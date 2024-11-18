package com.abhi.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/abhi/springcore/lifecycle/config.xml");
		Samosa ob =(Samosa)context.getBean("s1");
		System.out.println(ob);
		context.registerShutdownHook();
		
		//it is used to clean up the code
		
	}

}
