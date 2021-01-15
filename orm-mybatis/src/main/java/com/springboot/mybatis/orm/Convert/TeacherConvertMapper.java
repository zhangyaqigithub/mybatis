package com.springboot.mybatis.orm.Convert;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.springboot.mybatis.orm.dto.StudentDto2;
import com.springboot.mybatis.orm.dto.TeacherDto;
import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.vo.StudentVo;
import com.springboot.mybatis.orm.vo.TeacherVo;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2021年1月4日 上午11:24:04 
* 类说明 
*/
@Mapper(uses= {StudentDto2ConvertMapper.class})
public interface TeacherConvertMapper {
	TeacherConvertMapper INSTANCE  = Mappers.getMapper(TeacherConvertMapper.class);
	
	@Mapping(source="createDate",target="createDates")
	@Mapping(source="insertDate",target="insertDate",dateFormat="yyyy-MM-dd HH:mm:ss")
	@Mapping(source="name",target="myname")
	TeacherVo toVo(TeacherDto dto);
	List<TeacherVo> toVoALL(List<TeacherDto> list);
}
