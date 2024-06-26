package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinhuodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinhuodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinhuodingdanView;


/**
 * 进货订单
 *
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface JinhuodingdanService extends IService<JinhuodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinhuodingdanVO> selectListVO(Wrapper<JinhuodingdanEntity> wrapper);
   	
   	JinhuodingdanVO selectVO(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
   	
   	List<JinhuodingdanView> selectListView(Wrapper<JinhuodingdanEntity> wrapper);
   	
   	JinhuodingdanView selectView(@Param("ew") Wrapper<JinhuodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinhuodingdanEntity> wrapper);
   	
}

