package com.dao;

import com.entity.YingshoujineEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingshoujineVO;
import com.entity.view.YingshoujineView;


/**
 * 应收金额
 * 
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface YingshoujineDao extends BaseMapper<YingshoujineEntity> {
	
	List<YingshoujineVO> selectListVO(@Param("ew") Wrapper<YingshoujineEntity> wrapper);
	
	YingshoujineVO selectVO(@Param("ew") Wrapper<YingshoujineEntity> wrapper);
	
	List<YingshoujineView> selectListView(@Param("ew") Wrapper<YingshoujineEntity> wrapper);

	List<YingshoujineView> selectListView(Pagination page,@Param("ew") Wrapper<YingshoujineEntity> wrapper);
	
	YingshoujineView selectView(@Param("ew") Wrapper<YingshoujineEntity> wrapper);
	
}
