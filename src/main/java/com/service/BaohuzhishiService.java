package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaohuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaohuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaohuzhishiView;


/**
 * 保护知识
 *
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface BaohuzhishiService extends IService<BaohuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaohuzhishiVO> selectListVO(Wrapper<BaohuzhishiEntity> wrapper);
   	
   	BaohuzhishiVO selectVO(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
   	
   	List<BaohuzhishiView> selectListView(Wrapper<BaohuzhishiEntity> wrapper);
   	
   	BaohuzhishiView selectView(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaohuzhishiEntity> wrapper);
   	

}

