package com.springboot.mybatis.orm.Convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.springboot.mybatis.orm.test.User;
import com.springboot.mybatis.orm.untils.MapStructUtils;
import com.springboot.mybatis.orm.vo.UserVo;


/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午4:15:33 
* 类说明 
*/
@Mapper(uses=MapStructUtils.class)
public interface UserConvert {
	UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);
	UserVo tovo(User u);
}
