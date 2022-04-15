package com.dao;

import com.entity.DiscussbaohuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaohuzhishiVO;
import com.entity.view.DiscussbaohuzhishiView;


/**
 * 保护知识评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-23 22:18:54
 */
public interface DiscussbaohuzhishiDao extends BaseMapper<DiscussbaohuzhishiEntity> {
	
	List<DiscussbaohuzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
	
	DiscussbaohuzhishiVO selectVO(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
	
	List<DiscussbaohuzhishiView> selectListView(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);

	List<DiscussbaohuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
	
	DiscussbaohuzhishiView selectView(@Param("ew") Wrapper<DiscussbaohuzhishiEntity> wrapper);
	

}
