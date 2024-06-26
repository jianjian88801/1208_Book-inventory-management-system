package com.entity.view;

import com.entity.ShangpintuihuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品退货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
@TableName("shangpintuihuo")
public class ShangpintuihuoView  extends ShangpintuihuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpintuihuoView(){
	}
 
 	public ShangpintuihuoView(ShangpintuihuoEntity shangpintuihuoEntity){
 	try {
			BeanUtils.copyProperties(this, shangpintuihuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
