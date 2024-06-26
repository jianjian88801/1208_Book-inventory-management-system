package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShourujineEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShourujineVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShourujineView;


/**
 * 收入金额
 *
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface ShourujineService extends IService<ShourujineEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShourujineVO> selectListVO(Wrapper<ShourujineEntity> wrapper);
   	
   	ShourujineVO selectVO(@Param("ew") Wrapper<ShourujineEntity> wrapper);
   	
   	List<ShourujineView> selectListView(Wrapper<ShourujineEntity> wrapper);
   	
   	ShourujineView selectView(@Param("ew") Wrapper<ShourujineEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShourujineEntity> wrapper);
   	
}

