package cn.edu.cdu.dennis.proxy;

import cn.edu.cdu.dennis.interfaces.IHello;

public class ProxyHello implements IHello {
	
	private IHello hello;
	public ProxyHello(IHello hello) {
		this.hello = hello;
	}
	public void validateUser() {
		System.out.println("验证用户...");
	}
	@Override
	public void sayHello1() {
		// TODO Auto-generated method stub
		this.validateUser();
		hello.sayHello1();
	}
	@Override
	public void sayHello2() {
		// TODO Auto-generated method stub
		this.validateUser();
		hello.sayHello2();
	}
	@Override
	public void sayHello3() {
		// TODO Auto-generated method stub
		this.validateUser();
		hello.sayHello3();
	}

}
