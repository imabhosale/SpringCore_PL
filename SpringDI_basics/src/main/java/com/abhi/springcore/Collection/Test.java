package com.abhi.springcore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/abhi/springcore/Collection/Collectionconfig.xml");
		Emp ob1=(Emp)context.getBean("emp1");
		System.out.println(ob1.getName());
		System.out.println(ob1.getAddress());
		System.out.println(ob1.getCourse());
	}

}
