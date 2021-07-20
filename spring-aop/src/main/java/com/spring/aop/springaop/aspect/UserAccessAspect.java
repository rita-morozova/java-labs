package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// Define here what methods it would intercept before the actual method was
	// invoked
	// PointCut: execution(* PACKAGE.*.*(..)) - intercept any return type in the
	// specific - @Before("execution(* com.spring.aop.springaop.business.*.*(..))")
	// package, any class, all method calls in respect to their arguments
	// Aspect - is a combination of PointCut and Advice
	// JoinPoint - specific interception of a method call
	// Weaving - a process of implementing AOP around your methods

	@Before("com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Logic here is called Advice
		logger.info("Check for user acces");
		logger.info("Allowed execution for {} ", joinPoint);
	}
}
