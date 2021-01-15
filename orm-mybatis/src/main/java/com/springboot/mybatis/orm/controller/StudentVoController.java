package com.springboot.mybatis.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mybatis.orm.Convert.StudentConvertMapper;
import com.springboot.mybatis.orm.Convert.StudentDtoConvertMapper;
import com.springboot.mybatis.orm.dao.StudentDtoMapper;
import com.springboot.mybatis.orm.dao.StudentMapper;
import com.springboot.mybatis.orm.dto.StudentDto;
import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.model.StudentExample;
import com.springboot.mybatis.orm.vo.StudentVo;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午2:18:08 
* 类说明 
*/
@RestController
@Slf4j
public class StudentVoController {
	@Autowired
	StudentDtoMapper studto;
	@Autowired
	StudentMapper stuMapper;
	/*@Autowired
	StudentConvertMapper convert;*/
	@RequestMapping("/vo")
	public List<StudentVo> getAll() {
		List<StudentDto> listdto= studto.getAll();
		log.info("listdto:"+JSONUtil.toJsonStr(listdto));
		List<StudentVo> liststudentVO = StudentDtoConvertMapper.INSTANCE.DtoToVOs(listdto);
		return liststudentVO;
	} 
	@RequestMapping("/vo1")
	public StudentVo getAll1() {
		StudentDto dto= studto.getById(1);
		log.info("listdto:"+JSONUtil.toJsonStr(dto));
		StudentVo tVO = StudentDtoConvertMapper.INSTANCE.DtoToVO(dto);
		return tVO;
	} 
	@RequestMapping("/vo2")
	public StudentVo getAll2() {
		StudentExample example = new StudentExample();
		Student st= stuMapper.selectByPrimaryKey(1);
		log.info(JSONUtil.toJsonStr(st));
		StudentVo studentVO = StudentConvertMapper.INSTANCE.toVo(st);
		return studentVO;
	} 
}
