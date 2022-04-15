package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshuiziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshuiziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshuiziyuanView;


/**
 * 水资源评论表
 *
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface DiscussshuiziyuanService extends IService<DiscussshuiziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuiziyuanVO> selectListVO(Wrapper<DiscussshuiziyuanEntity> wrapper);
   	
   	DiscussshuiziyuanVO selectVO(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
   	
   	List<DiscussshuiziyuanView> selectListView(Wrapper<DiscussshuiziyuanEntity> wrapper);
   	
   	DiscussshuiziyuanView selectView(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshuiziyuanEntity> wrapper);
   	

}

