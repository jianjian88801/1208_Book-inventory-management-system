package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PixiaodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PixiaodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PixiaodingdanView;


/**
 * 批销订单
 *
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface PixiaodingdanService extends IService<PixiaodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PixiaodingdanVO> selectListVO(Wrapper<PixiaodingdanEntity> wrapper);
   	
   	PixiaodingdanVO selectVO(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
   	
   	List<PixiaodingdanView> selectListView(Wrapper<PixiaodingdanEntity> wrapper);
   	
   	PixiaodingdanView selectView(@Param("ew") Wrapper<PixiaodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PixiaodingdanEntity> wrapper);
   	
}

