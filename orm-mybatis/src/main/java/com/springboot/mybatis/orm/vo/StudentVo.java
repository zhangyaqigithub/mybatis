package com.springboot.mybatis.orm.vo;


import com.springboot.mybatis.orm.untils.GenderEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 上午11:28:19 
* 类说明 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVo {
	private String studentVoName;
	//private GenderEnum genderEnum;
	private String genderName;
	private String teacherName;
	private String crateDate;
	/*public String getStudentVoName() {
		return studentVoName;
	}
	public void setStudentVoName(String studentVoName) {
		this.studentVoName = studentVoName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getCrateDate() {
		return crateDate;
	}
	public void setCrateDate(String crateDate) {
		this.crateDate = crateDate;
	}
	public StudentVo(String studentVoName, String gender, String teacherName, String crateDate) {
		super();
		this.studentVoName = studentVoName;
		this.gender = gender;
		this.teacherName = teacherName;
		this.crateDate = crateDate;
	}
	public StudentVo() {
		super();
	}*/
	
}
