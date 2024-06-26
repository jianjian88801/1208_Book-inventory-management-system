package com.entity.view;

import com.entity.ShourujineEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收入金额
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
@TableName("shourujine")
public class ShourujineView  extends ShourujineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShourujineView(){
	}
 
 	public ShourujineView(ShourujineEntity shourujineEntity){
 	try {
			BeanUtils.copyProperties(this, shourujineEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
