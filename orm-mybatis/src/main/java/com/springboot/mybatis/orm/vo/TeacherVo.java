package com.springboot.mybatis.orm.vo;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2021年1月4日 上午11:11:49 
* 类说明 
*/

import java.util.Date;
import java.util.List;

import com.springboot.mybatis.orm.dto.StudentDto;
import com.springboot.mybatis.orm.dto.StudentDto2;
import com.springboot.mybatis.orm.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherVo {
	private String id;
	private String myname;
	private Date createDates;
	private String insertDate;
	private List<StudentDto2> listStu;

}
