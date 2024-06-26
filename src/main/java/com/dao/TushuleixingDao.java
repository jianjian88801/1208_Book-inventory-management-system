package com.dao;

import com.entity.TushuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuleixingVO;
import com.entity.view.TushuleixingView;


/**
 * 图书类型
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface TushuleixingDao extends BaseMapper<TushuleixingEntity> {
	
	List<TushuleixingVO> selectListVO(@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	
	TushuleixingVO selectVO(@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	
	List<TushuleixingView> selectListView(@Param("ew") Wrapper<TushuleixingEntity> wrapper);

	List<TushuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	
	TushuleixingView selectView(@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	
}
