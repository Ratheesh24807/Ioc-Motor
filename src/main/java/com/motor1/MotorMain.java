package com.motor1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotorMain {
	
	public static void main(String[] args) {
		
   ApplicationContext context = new ClassPathXmlApplicationContext("Motorbeans.xml");
   
		
	}

}
