package com.springboot.mybatis.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.mybatis.orm.dao.PmsDtoMapper;
import com.springboot.mybatis.orm.dao.PmsProductMapper;
import com.springboot.mybatis.orm.dto.PmsDto;
import com.springboot.mybatis.orm.model.PmsProduct;
import com.springboot.mybatis.orm.model.PmsProductExample;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2021年1月4日 下午3:40:27 
* 类说明 
*/
@RestController
@Slf4j
public class PmsController {
	@Autowired 
	private PmsProductMapper pms;
	@Autowired 
	private PmsDtoMapper pmsd;
	
	@RequestMapping("/pms")
	public PageInfo<PmsProduct> getAll(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		PmsProductExample pme = new PmsProductExample();
		PageInfo<PmsProduct> pageInfo = new PageInfo<>(pms.selectByExample(pme));
		//List<PmsProduct> list = pms.selectByExample(pme);
		return pageInfo;
	}
	@RequestMapping("/pmsd")
	public PageInfo<PmsDto> getAlls(){
		long startTime = System.currentTimeMillis();
		//PmsProductExample pme = new PmsProductExample();
		PageHelper.startPage(1,3);
		List<PmsDto> list = pmsd.getAll();
		PageInfo<PmsDto> pageInfo = new PageInfo<>(list);
		long endTime = System.currentTimeMillis();
		long time = endTime-startTime;
		log.info(String.valueOf(time));
		//List<PmsProduct> list = pms.selectByExample(pme);
		return pageInfo;
	}
	@RequestMapping("/pmsds")
	public List<PmsDto> getAllss(){
		//PmsProductExample pme = new PmsProductExample();
		PageHelper.startPage(1,3);
		List<PmsDto> list = pmsd.getAll();
		//PageInfo<PmsDto> pageInfo = new PageInfo<>(list);
		//List<PmsProduct> list = pms.selectByExample(pme);
		return list;
	}
}
