package com.xworkz.Resort;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.Resort.app.Resort;

public class SpringTester {
	public static void main(String[] args) {
		try {
			String metaInfo="spring.xml";
			ApplicationContext Spring = new ClassPathXmlApplicationContext(metaInfo);
			Resort refOFResort = Spring.getBean(Resort.class);
			refOFResort.shopping();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
