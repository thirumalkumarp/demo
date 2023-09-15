package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
	/*
	 * public static void main_99(String[] args) { Resource resource=new
	 * ClassPathResource("applicationContext.xml"); BeanFactory factory=new
	 * XmlBeanFactory(resource);
	 * 
	 * Employe Employe=(Employe)factory.getBean("Employe"); Employe.displayInfo(); }
	 */
public static void main(String[] args) {
	ApplicationContext contect = new ClassPathXmlApplicationContext("applicationContext.xml");
	Employe emp = (Employe)contect.getBean("Employe");
	emp.displayInfo();
}
}  