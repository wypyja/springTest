package cn.edu.cdu.dennis.test;

import cn.edu.cdu.dennis.impl.Hello;
import cn.edu.cdu.dennis.interfaces.IHello;
import cn.edu.cdu.dennis.proxy.ProxyHello;

public class Test {

	public static void main(String[] args) {
		IHello hello = new ProxyHello(new Hello());
		hello.sayHello1();
		hello.sayHello2();
		hello.sayHello3();
	}
}
