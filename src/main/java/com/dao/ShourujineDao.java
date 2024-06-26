package com.dao;

import com.entity.ShourujineEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShourujineVO;
import com.entity.view.ShourujineView;


/**
 * 收入金额
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface ShourujineDao extends BaseMapper<ShourujineEntity> {
	
	List<ShourujineVO> selectListVO(@Param("ew") Wrapper<ShourujineEntity> wrapper);
	
	ShourujineVO selectVO(@Param("ew") Wrapper<ShourujineEntity> wrapper);
	
	List<ShourujineView> selectListView(@Param("ew") Wrapper<ShourujineEntity> wrapper);

	List<ShourujineView> selectListView(Pagination page,@Param("ew") Wrapper<ShourujineEntity> wrapper);
	
	ShourujineView selectView(@Param("ew") Wrapper<ShourujineEntity> wrapper);
	
}
