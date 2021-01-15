package com.springboot.mybatis.orm.dto;

import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.model.Teacher;
import com.springboot.mybatis.orm.untils.GenderEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 上午11:24:11 
* 类说明 :多对一关系
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto extends Student{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2564189012475075562L;
	//多个学生对应一个老师
	private Teacher teacher;
	
	
	
	
}
