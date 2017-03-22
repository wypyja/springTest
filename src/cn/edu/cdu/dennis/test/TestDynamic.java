package cn.edu.cdu.dennis.test;

import cn.edu.cdu.dennis.impl.Hello;
import cn.edu.cdu.dennis.interfaces.IHello;
import cn.edu.cdu.dennis.proxy.DynamicProxy;

public class TestDynamic {
	public static void main(String[] args) {
		DynamicProxy proxy = new DynamicProxy();
		IHello hello = (IHello) proxy.bind(new Hello());
		hello.sayHello1();
		hello.sayHello2();
		hello.sayHello3();
	}
}
