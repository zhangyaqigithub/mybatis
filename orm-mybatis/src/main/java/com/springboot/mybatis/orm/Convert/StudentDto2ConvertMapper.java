package com.springboot.mybatis.orm.Convert;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

import com.springboot.mybatis.orm.dto.StudentDto2;
import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.untils.GenderEnum;


/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 上午11:37:22 
* 类说明 
*/
@Mapper
public interface StudentDto2ConvertMapper {
	StudentDto2ConvertMapper INSTANCE  = Mappers.getMapper(StudentDto2ConvertMapper.class);
	
	
	@Mapping(target="gender",expression="java(com.springboot.mybatis.orm.untils.GenderEnum.value2Of(st.getGender()))")
	StudentDto2 ToDto(Student st);
	
	
	
	
}
