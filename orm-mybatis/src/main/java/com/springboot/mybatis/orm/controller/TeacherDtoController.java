package com.springboot.mybatis.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.mybatis.orm.Convert.TeacherConvertMapper;
import com.springboot.mybatis.orm.dao.TeacherDtoMapper;
import com.springboot.mybatis.orm.dto.TeacherDto;
import com.springboot.mybatis.orm.vo.TeacherVo;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月23日 下午2:33:06 
* 类说明 
*/
@Controller
public class TeacherDtoController {
	@Autowired
	TeacherDtoMapper teacherDto;
	@RequestMapping("teacher/getbyid")
	@ResponseBody
	public TeacherDto getbyId(Integer id) {
		TeacherDto teaDto = teacherDto.getById(id);
		return teaDto;
	}
	@RequestMapping("teacher/getAll")
	@ResponseBody
	public List<TeacherDto> getAll() {
		List<TeacherDto> teaDtolist = teacherDto.getAll();
		return teaDtolist;
	}
	@RequestMapping("teacher/getVoAll")
	@ResponseBody
	public List<TeacherVo> getvoAll() {
		List<TeacherDto> teaDtolist = teacherDto.getAll();
		List<TeacherVo> list=TeacherConvertMapper.INSTANCE.toVoALL(teaDtolist);
		return list;
	}
}
