package com.springboot.mybatis.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.mybatis.orm.dao.StudentDtoMapper;
import com.springboot.mybatis.orm.dao.StudentMapper;
import com.springboot.mybatis.orm.dto.PmsDto;
import com.springboot.mybatis.orm.dto.StudentDto;
import com.springboot.mybatis.orm.model.Student;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 上午11:56:02 
* 类说明 
*/
@Controller
public class StudentDtoController {
	@Autowired
	StudentDtoMapper studto;
	@Autowired
	StudentMapper st;
	@RequestMapping("/test")
	@ResponseBody
	public StudentDto getById(Integer id) {
		StudentDto dto = studto.getById(id);
		
		return dto;
	}
	@RequestMapping("/test2")
	@ResponseBody
	public Student getById2(Integer id) {
		Student student = st.selectByPrimaryKey(id);
		
		return student;
	}
	@RequestMapping("/getAll/{pageNum}/{pageSize}")
	@ResponseBody
	public PageInfo<StudentDto> getAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<StudentDto> listdto = studto.getAll();
		PageInfo<StudentDto> pageInfo = new PageInfo<>(listdto);
		return pageInfo;
	}
}
