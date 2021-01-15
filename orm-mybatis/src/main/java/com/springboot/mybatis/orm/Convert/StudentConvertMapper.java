package com.springboot.mybatis.orm.Convert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.springboot.mybatis.orm.model.Student;
import com.springboot.mybatis.orm.vo.StudentVo;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午3:01:30 
* 类说明 
*/
@Mapper
public interface StudentConvertMapper {
	StudentConvertMapper INSTANCE = Mappers.getMapper(StudentConvertMapper.class);
	@Mapping(source="name",target="studentVoName",dateFormat="yyyy-MM-dd HH:mm:ss")
	@Mapping(source="createDate",target="crateDate",dateFormat="yyyy-MM-dd HH:mm:ss")
	StudentVo toVo(Student st);
}
