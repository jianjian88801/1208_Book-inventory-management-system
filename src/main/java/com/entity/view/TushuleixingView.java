package com.entity.view;

import com.entity.TushuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
@TableName("tushuleixing")
public class TushuleixingView  extends TushuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushuleixingView(){
	}
 
 	public TushuleixingView(TushuleixingEntity tushuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, tushuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
