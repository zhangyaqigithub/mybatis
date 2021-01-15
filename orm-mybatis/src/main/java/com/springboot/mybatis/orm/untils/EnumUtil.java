package com.springboot.mybatis.orm.untils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
* @author 作者 Your-Name: ts03033
* @version 创建时间：2020年12月24日 下午1:20:26 
* 类说明 
*/
public class EnumUtil {
    //返回的对象实现CodeEnum接口    
    public static void main(String[] args) {
		System.out.println(GenderEnum.value2Of(1));
		System.out.println(GenderEnum.values());
		
		System.out.println(getMsgByCode(GenderEnum.class,"getCode",1).getName());
		
	}
    public static <T extends Enum<T>> T getMsgByCode(Class<T> clazz,String getTypeCodeMethodName, Integer typeCode){
        T result = null;
        try{
            //Enum接口中没有values()方法，我们仍然可以通过Class对象取得所有的enum实例
            T[] arr = clazz.getEnumConstants();
            //获取定义的方法
            Method targetMethod = clazz.getDeclaredMethod(getTypeCodeMethodName);
            Integer typeCodeVal = null;
            //遍历枚举定义
            for(T entity:arr){
                //获取传过来方法的
                typeCodeVal = Integer.valueOf(targetMethod.invoke(entity).toString());
                //执行的方法的值等于参数传过来要判断的值
                if(typeCodeVal.equals(typeCode)){
                    //返回这个枚举
                    result = entity;
                    break;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return result;
    }
}
