package com.springboot.mybatis.orm.dao;

import java.util.List;

import com.springboot.mybatis.orm.dto.PmsDto;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2021年1月4日 下午3:55:47 
* 类说明 
*/
public interface PmsDtoMapper {
	public List<PmsDto> getAll();
	public long getAll_COUNT();
	
}
