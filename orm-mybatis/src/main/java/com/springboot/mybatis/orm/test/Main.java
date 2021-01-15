package com.springboot.mybatis.orm.test;

import com.springboot.mybatis.orm.Convert.UserConvert;
import com.springboot.mybatis.orm.vo.UserVo;

import cn.hutool.json.JSONUtil;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午4:33:27 
* 类说明 
*/
public class Main {
	public static void main(String[] args) {
		User u = new User();
		u.setId(1);
		u.setName("哈哈");
		u.setGender(-1);
		UserVo v = UserConvert.INSTANCE.tovo(u);
		System.out.println(JSONUtil.toJsonStr(v.getGender().getName()));
	}
}
