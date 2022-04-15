package com.dao;

import com.entity.ShuiziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiziyuanVO;
import com.entity.view.ShuiziyuanView;


/**
 * 水资源
 * 
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface ShuiziyuanDao extends BaseMapper<ShuiziyuanEntity> {
	
	List<ShuiziyuanVO> selectListVO(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
	
	ShuiziyuanVO selectVO(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
	
	List<ShuiziyuanView> selectListView(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);

	List<ShuiziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
	
	ShuiziyuanView selectView(@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuiziyuanEntity> wrapper);
}
