package com.springboot.mybatis.orm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springboot.mybatis.orm.dto.StudentDto;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 上午11:41:25 
* 类说明 :通过学生Id获取学生信息及对应的老师信息
*/
public interface StudentDtoMapper {
	public StudentDto getById(@Param("id") Integer id);
	public List<StudentDto> getAll();
}
