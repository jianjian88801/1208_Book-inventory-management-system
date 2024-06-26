package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KucunfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KucunfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KucunfenxiView;


/**
 * 库存分析
 *
 * @author 
 * @email 
 * @date 2021-04-21 23:28:06
 */
public interface KucunfenxiService extends IService<KucunfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KucunfenxiVO> selectListVO(Wrapper<KucunfenxiEntity> wrapper);
   	
   	KucunfenxiVO selectVO(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
   	
   	List<KucunfenxiView> selectListView(Wrapper<KucunfenxiEntity> wrapper);
   	
   	KucunfenxiView selectView(@Param("ew") Wrapper<KucunfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KucunfenxiEntity> wrapper);
   	
}

