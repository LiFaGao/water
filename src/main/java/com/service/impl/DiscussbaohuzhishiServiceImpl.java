package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussbaohuzhishiDao;
import com.entity.DiscussbaohuzhishiEntity;
import com.service.DiscussbaohuzhishiService;
import com.entity.vo.DiscussbaohuzhishiVO;
import com.entity.view.DiscussbaohuzhishiView;

@Service("discussbaohuzhishiService")
public class DiscussbaohuzhishiServiceImpl extends ServiceImpl<DiscussbaohuzhishiDao, DiscussbaohuzhishiEntity> implements DiscussbaohuzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaohuzhishiEntity> page = this.selectPage(
                new Query<DiscussbaohuzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussbaohuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaohuzhishiEntity> wrapper) {
		  Page<DiscussbaohuzhishiView> page =new Query<DiscussbaohuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaohuzhishiVO> selectListVO(Wrapper<DiscussbaohuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaohuzhishiVO selectVO(Wrapper<DiscussbaohuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaohuzhishiView> selectListView(Wrapper<DiscussbaohuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaohuzhishiView selectView(Wrapper<DiscussbaohuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
