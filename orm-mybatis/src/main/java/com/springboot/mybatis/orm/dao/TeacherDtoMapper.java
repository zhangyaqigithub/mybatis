package com.springboot.mybatis.orm.dao;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 下午2:23:32 
* 类说明 
*/

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springboot.mybatis.orm.dto.TeacherDto;

public interface TeacherDtoMapper {
	public TeacherDto getById(@Param("id")Integer id);
	public List<TeacherDto> getAll();
}
