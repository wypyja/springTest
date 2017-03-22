package cn.edu.cdu.dennis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.edu.cdu.dennis.interfaces.IHello;

public class TestBeforAdvice {

	public static void main(String[] args) {
		System.out.println("haha");
//		ApplicationContext  ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
//			IHello hello = (IHello)ac.getBean("proxy");
//			hello.sayHello1();
//			hello.sayHello2();
//			hello.sayHello3();
	}

}
