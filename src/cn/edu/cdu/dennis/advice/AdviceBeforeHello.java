package cn.edu.cdu.dennis.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AdviceBeforeHello implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("验证用户...");
	}

}
