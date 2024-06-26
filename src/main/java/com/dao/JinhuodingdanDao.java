package com.dao;

import com.entity.JinhuodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinhuodingdanVO;
import com.entity.view.JinhuodingdanView;


/**
 * 进货订单
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface JinhuodingdanDao extends BaseMapper<JinhuodingdanEntity> {
	
	List<JinhuodingdanVO> selectListVO(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
	
	JinhuodingdanVO selectVO(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
	
	List<JinhuodingdanView> selectListView(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);

	List<JinhuodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
	
	JinhuodingdanView selectView(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
	
}
