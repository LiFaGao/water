package com.dao;

import com.entity.BaohuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaohuzhishiVO;
import com.entity.view.BaohuzhishiView;


/**
 * 保护知识
 * 
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface BaohuzhishiDao extends BaseMapper<BaohuzhishiEntity> {
	
	List<BaohuzhishiVO> selectListVO(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
	
	BaohuzhishiVO selectVO(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
	
	List<BaohuzhishiView> selectListView(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);

	List<BaohuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
	
	BaohuzhishiView selectView(@Param("ew") Wrapper<BaohuzhishiEntity> wrapper);
	

}
