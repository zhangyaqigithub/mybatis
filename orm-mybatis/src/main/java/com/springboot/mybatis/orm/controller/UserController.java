package com.springboot.mybatis.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mybatis.orm.Convert.UserConvert;
import com.springboot.mybatis.orm.test.User;
import com.springboot.mybatis.orm.vo.UserVo;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月25日 下午3:52:59 
* 类说明 
*/
@Controller
@Slf4j
public class UserController {
	
	@RequestMapping("/u")
	@ResponseBody
	public User getUserVo2(Model model) {
		User u = new User();
		u.setId(1);
		u.setName("我");
		u.setGender(0);
		System.out.println("uuuuu");
		return u;
	}
	@RequestMapping("/user")
	@ResponseBody
	public UserVo getUserVo() {
		User u = new User();
		u.setId(1);
		u.setName("我");
		u.setGender(0);
		UserVo userVo = UserConvert.INSTANCE.tovo(u);
		
		log.info(JSONUtil.toJsonStr(userVo));
		return userVo;
	}
}
