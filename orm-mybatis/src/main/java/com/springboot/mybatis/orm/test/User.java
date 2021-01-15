package com.springboot.mybatis.orm.test;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午4:14:24 
* 类说明 
*/
public class User {
	private String name;
	private Integer id;
	private Integer gender;
	
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public User() {
		super();
	}
	
}
