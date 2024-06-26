package com.entity.view;

import com.entity.PixiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 批销订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
@TableName("pixiaodingdan")
public class PixiaodingdanView  extends PixiaodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PixiaodingdanView(){
	}
 
 	public PixiaodingdanView(PixiaodingdanEntity pixiaodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, pixiaodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
