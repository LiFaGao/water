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


import com.dao.BaohuzhishiDao;
import com.entity.BaohuzhishiEntity;
import com.service.BaohuzhishiService;
import com.entity.vo.BaohuzhishiVO;
import com.entity.view.BaohuzhishiView;

@Service("baohuzhishiService")
public class BaohuzhishiServiceImpl extends ServiceImpl<BaohuzhishiDao, BaohuzhishiEntity> implements BaohuzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaohuzhishiEntity> page = this.selectPage(
                new Query<BaohuzhishiEntity>(params).getPage(),
                new EntityWrapper<BaohuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaohuzhishiEntity> wrapper) {
		  Page<BaohuzhishiView> page =new Query<BaohuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaohuzhishiVO> selectListVO(Wrapper<BaohuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaohuzhishiVO selectVO(Wrapper<BaohuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaohuzhishiView> selectListView(Wrapper<BaohuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaohuzhishiView selectView(Wrapper<BaohuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
