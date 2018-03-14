package com.wanmait.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wanmait.demo.service.UserService;
import com.wanmait.demo.vo.User;

@Controller
@RequestMapping("/manage/admin")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public void add(){
		
	}
	
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(User user){
		userService.insert(user);
		return "redirect:/manage/user/list";
	}
	
	@RequestMapping("listJson")
	@ResponseBody  //直接通过ajax返回json格式，要求添加jackson的jar
	public List<User> findAllJSON()
	{
		return  userService.findAll();
	}
	@RequestMapping("list")
	public ModelAndView findAll()
	{
		ModelAndView mv = new ModelAndView();
		List<User> users = userService.findAll();
		mv.addObject("users", users);
		//mv.setViewName("/manage/user/list");
		return mv;
	}
}












