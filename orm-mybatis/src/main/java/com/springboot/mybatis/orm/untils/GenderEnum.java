package com.springboot.mybatis.orm.untils;
/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 上午11:32:01 
* 类说明 
*/
public enum GenderEnum {
	male(1,"帅哥") , falme(0,"美女"),ex(-1,"人妖");
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private GenderEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	 // 由传入的Key值返回对应的value2值
    public static String value2Of(int code) {
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.getCode() == code) {
                return genderEnum.getName();
            }
        }
        return GenderEnum.ex.getName();
    }
    public  String valueOf(int code) {
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.getCode() == code) {
                return genderEnum.getName();
            }
        }
        return null;
    }
	
	
}
