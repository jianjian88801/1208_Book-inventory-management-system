package com.dao;

import com.entity.KucunfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KucunfenxiVO;
import com.entity.view.KucunfenxiView;


/**
 * 库存分析
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface KucunfenxiDao extends BaseMapper<KucunfenxiEntity> {
	
	List<KucunfenxiVO> selectListVO(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
	
	KucunfenxiVO selectVO(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
	
	List<KucunfenxiView> selectListView(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);

	List<KucunfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
	
	KucunfenxiView selectView(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
	
}
