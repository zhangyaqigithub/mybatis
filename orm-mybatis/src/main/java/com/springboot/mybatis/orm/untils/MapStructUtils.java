package com.springboot.mybatis.orm.untils;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月25日 下午3:45:11 
* 类说明 
*/
public class MapStructUtils {
	public GenderEnum toEnumUserType(int value){
	    for(GenderEnum type : GenderEnum.values()){
	        if(type.getCode() == value)
	            return type;
	    }
	    return null;
	}
}
