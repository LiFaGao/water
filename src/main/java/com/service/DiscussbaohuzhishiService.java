package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaohuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaohuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaohuzhishiView;


/**
 * 保护知识评论表
 *
 * @author 
 * @email 
 * @date 2022-03-23 22:18:54
 */
public interface DiscussbaohuzhishiService extends IService<DiscussbaohuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaohuzhishiVO> selectListVO(Wrapper<DiscussbaohuzhishiEntity> wrapper);
   	
   	DiscussbaohuzhishiVO selectVO(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
   	
   	List<DiscussbaohuzhishiView> selectListView(Wrapper<DiscussbaohuzhishiEntity> wrapper);
   	
   	DiscussbaohuzhishiView selectView(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaohuzhishiEntity> wrapper);
   	

}

