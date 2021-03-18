package com.marcuschiu;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {

	@Around("execution(* *(..)) && within(com.marcuschiu..*) && !within(com.marcuschiu.AspectConfig+)")
	public Object advice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Intercepted: " + joinPoint.toShortString());
		return joinPoint.proceed();
	}
}
