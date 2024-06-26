package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingshoujineEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingshoujineVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingshoujineView;


/**
 * 应收金额
 *
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface YingshoujineService extends IService<YingshoujineEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingshoujineVO> selectListVO(Wrapper<YingshoujineEntity> wrapper);
   	
   	YingshoujineVO selectVO(@Param("ew") Wrapper<YingshoujineEntity> wrapper);
   	
   	List<YingshoujineView> selectListView(Wrapper<YingshoujineEntity> wrapper);
   	
   	YingshoujineView selectView(@Param("ew") Wrapper<YingshoujineEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingshoujineEntity> wrapper);
   	
}

