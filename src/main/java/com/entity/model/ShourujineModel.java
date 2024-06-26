package com.entity.model;

import com.entity.ShourujineEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收入金额
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public class ShourujineModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书数量
	 */
	
	private String tushushuliang;
		
	/**
	 * 收入金额
	 */
	
	private String shourujine;
		
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
	 * 设置：收入金额
	 */
	 
	public void setShourujine(String shourujine) {
		this.shourujine = shourujine;
	}
	
	/**
	 * 获取：收入金额
	 */
	public String getShourujine() {
		return shourujine;
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
