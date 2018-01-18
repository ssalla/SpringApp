package com.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("com/inherit/AppContext.xml");
		
		Vehicle v = ap.getBean("veh", Vehicle.class);
		System.out.println(v);
		
		Vehicle v1 = ap.getBean("vehc1", Vehicle.class);
		System.out.println(v1);
		
		Vehicle v2 = ap.getBean("vehc2", Vehicle.class);
		System.out.println(v2);


	}

}
