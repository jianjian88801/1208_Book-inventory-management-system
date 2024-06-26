package com.entity.model;

import com.entity.YingshoujineEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 应收金额
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public class YingshoujineModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书数量
	 */
	
	private String tushushuliang;
		
	/**
	 * 应收金额
	 */
	
	private String yingshoujine;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：图书数量
	 */
	 
	public void setTushushuliang(String tushushuliang) {
		this.tushushuliang = tushushuliang;
	}
	
	/**
	 * 获取：图书数量
	 */
	public String getTushushuliang() {
		return tushushuliang;
	}
				
	
	/**
	 * 设置：应收金额
	 */
	 
	public void setYingshoujine(String yingshoujine) {
		this.yingshoujine = yingshoujine;
	}
	
	/**
	 * 获取：应收金额
	 */
	public String getYingshoujine() {
		return yingshoujine;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
