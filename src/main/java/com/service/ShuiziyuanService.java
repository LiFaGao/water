package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiziyuanView;


/**
 * 水资源
 *
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface ShuiziyuanService extends IService<ShuiziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiziyuanVO> selectListVO(Wrapper<ShuiziyuanEntity> wrapper);
   	
   	ShuiziyuanVO selectVO(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
   	
   	List<ShuiziyuanView> selectListView(Wrapper<ShuiziyuanEntity> wrapper);
   	
   	ShuiziyuanView selectView(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiziyuanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShuiziyuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShuiziyuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShuiziyuanEntity> wrapper);
}

