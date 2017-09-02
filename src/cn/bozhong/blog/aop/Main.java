package cn.bozhong.blog.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/bozhong/blog/spring/applicationContext-aop.xml");
   Test test = (Test)ctx.getBean("test");
   int result = test.add(66, 66);
   System.out.println(result);
   
}
}
