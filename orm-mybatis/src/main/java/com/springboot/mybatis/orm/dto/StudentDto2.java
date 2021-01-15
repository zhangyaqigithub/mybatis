package com.springboot.mybatis.orm.dto;

import com.springboot.mybatis.orm.vo.StudentVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2021年1月4日 上午11:22:46 
* 类说明 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto2 {
	private Integer id;
	private String name;
	private String gender;
}
