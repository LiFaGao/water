package com.dao;

import com.entity.DiscussshuiziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshuiziyuanVO;
import com.entity.view.DiscussshuiziyuanView;


/**
 * 水资源评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
public interface DiscussshuiziyuanDao extends BaseMapper<DiscussshuiziyuanEntity> {
	
	List<DiscussshuiziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
	
	DiscussshuiziyuanVO selectVO(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
	
	List<DiscussshuiziyuanView> selectListView(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);

	List<DiscussshuiziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
	
	DiscussshuiziyuanView selectView(@Param("ew") Wrapper<DiscussshuiziyuanEntity> wrapper);
	

}
