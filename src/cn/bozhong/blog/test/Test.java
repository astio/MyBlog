package cn.bozhong.blog.test;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bozhong.blog.mapper.UserMapper;

import cn.bozhong.blog.pojo.User;
import cn.bozhong.blog.service.UserAdd;
import cn.bozhong.blog.service.impl.UserAddImpl;



public class Test {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/bozhong/blog/spring/applicationContext-dao.xml");
	
	UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
	User user  = new User();

	
	@Autowired
    private  UserAdd userAdd ;
	

   public void test(){
	 userMapper.updatePassword("2222", "5173");
   }
	
  public static void main(String[] args) {
  Test test = new Test();
  test.test();
	
	  
}
}
