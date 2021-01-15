package com.springboot.mybatis.orm.Convert;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

import com.springboot.mybatis.orm.dto.StudentDto;
import com.springboot.mybatis.orm.untils.GenderEnum;
import com.springboot.mybatis.orm.vo.StudentVo;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 上午11:37:22 
* 类说明 
*/
@Mapper
public interface StudentDtoConvertMapper {
	StudentDtoConvertMapper INSTANCE  = Mappers.getMapper(StudentDtoConvertMapper.class);
	
	/*@ValueMappings({
        @ValueMapping(source = "1", target = "male"),
        @ValueMapping(source = "0", target = "falme"),
        @ValueMapping(source = MappingConstants.NULL, target = "ex"),
        @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "ex"),
	})
	GenderEnum toEnum(Integer gender);*/
	//@Mapping(source="dto.gender",target="genderEnum")
	@Mapping(target="genderName",expression="java(com.springboot.mybatis.orm.untils.GenderEnum.value2Of(dto.getGender()))")
	@Mapping(source="dto.createDate",target="crateDate",dateFormat="yyyy-MM-dd HH:mm:ss")
	@Mapping(source="dto.teacher.name",target="teacherName")
	@Mapping(source="dto.name",target="studentVoName")
	//@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
	StudentVo DtoToVO(StudentDto dto);
	List<StudentVo> DtoToVOs(List<StudentDto> dto);
	
	//枚举类字段转换
   /* default   GenderEnum customConveter(Integer code){
        for (GenderEnum  ge: GenderEnum.values()){
            if (ge.getCode()==code){
                return ge;
            }
        }
        return null;
    }*/
	
}
