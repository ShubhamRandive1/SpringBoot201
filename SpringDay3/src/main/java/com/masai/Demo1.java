package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo d = ctx.getBean("dm",Demo.class);
		
		d.shoDetails();
		
		d.myInit();
		
		d.cleanUp();
		
	
	}

}
