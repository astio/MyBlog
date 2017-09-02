package cn.bozhong.blog.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(0)   //order越小 权限越高
@Component
public class VlidationAspect {
  @Pointcut("execution(public int cn.bozhong.blog.aop.TestImpl.*(..)))")
  public void address(){}
  
  @Before("execution(public int cn.bozhong.blog.aop.TestImpl.*(..)))")
  public void beforeMethod(JoinPoint joinPoint){
	   String name = joinPoint.getSignature().getName();
	   Object [] args = joinPoint.getArgs();
	   
	   System.out.println("method:"+name+Arrays.asList(args)+"Vlidation");
	  
  }
}
