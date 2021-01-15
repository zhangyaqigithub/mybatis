package com.springboot.mybatis.orm.vo;

import com.springboot.mybatis.orm.untils.GenderEnum;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午4:17:33 
* 类说明 
*/
public class UserVo {
	private Integer id;
	private String name;
	private Integer age;
	private GenderEnum gender;
	
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public UserVo(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public UserVo() {
		super();
	}
	
}
