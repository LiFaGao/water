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


import com.dao.DiscussshuiziyuanDao;
import com.entity.DiscussshuiziyuanEntity;
import com.service.DiscussshuiziyuanService;
import com.entity.vo.DiscussshuiziyuanVO;
import com.entity.view.DiscussshuiziyuanView;

@Service("discussshuiziyuanService")
public class DiscussshuiziyuanServiceImpl extends ServiceImpl<DiscussshuiziyuanDao, DiscussshuiziyuanEntity> implements DiscussshuiziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshuiziyuanEntity> page = this.selectPage(
                new Query<DiscussshuiziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussshuiziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuiziyuanEntity> wrapper) {
		  Page<DiscussshuiziyuanView> page =new Query<DiscussshuiziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshuiziyuanVO> selectListVO(Wrapper<DiscussshuiziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshuiziyuanVO selectVO(Wrapper<DiscussshuiziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshuiziyuanView> selectListView(Wrapper<DiscussshuiziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshuiziyuanView selectView(Wrapper<DiscussshuiziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
