package cn.bozhong.blog.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bozhong.blog.pojo.User;
import cn.bozhong.blog.service.UserAdd;

@Controller
public class AjaxJsonTestController {
	@Autowired
	UserAdd userAdd;
	
	 @RequestMapping(value = "saveUser", method = {RequestMethod.POST }) 
	    @ResponseBody  
	    public void saveUser(@RequestBody List<User> users) { 
		 System.out.println("come in");
	         User user = users.get(0);
	         System.out.println(user.getUsername()+"   "+user.getSex()+"111");
	         userAdd.userAdd(user);
	        
	    } 
	 @ResponseBody
	 @RequestMapping("/ajax")
	public Object ajax(HttpServletRequest request){
		 User user = new User();
		 user.setUsername("myname");
		 user.setHistory("hhhhh");
		 user.setPassword("2312");
		return user;
		 
	 }
	
}
