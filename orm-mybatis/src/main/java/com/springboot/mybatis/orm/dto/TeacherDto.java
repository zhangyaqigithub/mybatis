package com.springboot.mybatis.orm.dto;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 下午2:21:01 
* 类说明 :一对多。一个老师对应多个学生
*/

import java.util.List;

import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.model.Teacher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto extends Teacher{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2964447786095866002L;
	private List<Student> listStu;
}
