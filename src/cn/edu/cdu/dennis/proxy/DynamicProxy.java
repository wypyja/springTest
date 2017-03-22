package cn.edu.cdu.dennis.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class DynamicProxy implements InvocationHandler{
	private Object obj;
	public Object bind(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try{
//			在这里调用不同的方法，从而达到不需要修改被代理类而实现不同的业务嵌入
			validateUser();
			result = method.invoke(obj, args);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	public void validateUser(){
		System.out.println("验证用户...");
	}
}
