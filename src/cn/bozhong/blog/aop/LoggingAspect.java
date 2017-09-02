package cn.bozhong.blog.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Aspect
public class LoggingAspect {
 @Pointcut("execution(public int cn.bozhong.blog.aop.TestImpl.*(..))")
 public void address(){}
 
 /*
  *  java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表； 
 Signature getSignature() ：获取连接点的方法签名对象； 
 java.lang.Object getTarget() ：获取连接点所在的目标对象； 
 java.lang.Object getThis() ：获取代理对象本身； 
  */
 @Before("address()")
 public void beforeMethod(JoinPoint joinPoint){
	 String name =  joinPoint.getSignature().getName();  //取方法名字
	 Object[] args = joinPoint.getArgs();
	 
	 System.out.println("method: "+name+"begins with"+Arrays.asList(args));
 }
 
 @After("address()")
  public void afterMethod(JoinPoint joinPoint){
	   String methodName = joinPoint.getSignature().getName();
	   Object [] args = joinPoint.getArgs();  
    	System.out.println("The method   :" + methodName +"-   after with   " + Arrays.asList(args));
 }
}
