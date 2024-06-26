package com.dao;

import com.entity.PixiaodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PixiaodingdanVO;
import com.entity.view.PixiaodingdanView;


/**
 * 批销订单
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface PixiaodingdanDao extends BaseMapper<PixiaodingdanEntity> {
	
	List<PixiaodingdanVO> selectListVO(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
	
	PixiaodingdanVO selectVO(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
	
	List<PixiaodingdanView> selectListView(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);

	List<PixiaodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
	
	PixiaodingdanView selectView(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
	
}
