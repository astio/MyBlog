package cn.bozhong.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping("/login")
     public String Login(HttpServletRequest req,HttpServletResponse resp){
		resp.setHeader("Access-Control-Allow-Origin", "*");
		return "login";   
     }
}
