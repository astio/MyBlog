package cn.bozhong.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bozhong.blog.pojo.User;
import cn.bozhong.blog.service.UserAdd;





@Controller
public class UserController {
     
	@Autowired
	UserAdd userAdd;
	
	@RequestMapping("/hello")
	 public String Create(Model model){
		 return"create";
	 }
	@RequestMapping("/save")
	 public String Save(@ModelAttribute("form") User user , Model model) {
		  model.addAttribute("user", user);
		  userAdd.userAdd(user);
		  userAdd.updatePassword("222222", user.getUserId());
		  System.out.println(user.toString());
		  return "detail";
	 }
}
