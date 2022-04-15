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


import com.dao.ShuiziyuanDao;
import com.entity.ShuiziyuanEntity;
import com.service.ShuiziyuanService;
import com.entity.vo.ShuiziyuanVO;
import com.entity.view.ShuiziyuanView;

@Service("shuiziyuanService")
public class ShuiziyuanServiceImpl extends ServiceImpl<ShuiziyuanDao, ShuiziyuanEntity> implements ShuiziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiziyuanEntity> page = this.selectPage(
                new Query<ShuiziyuanEntity>(params).getPage(),
                new EntityWrapper<ShuiziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiziyuanEntity> wrapper) {
		  Page<ShuiziyuanView> page =new Query<ShuiziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiziyuanVO> selectListVO(Wrapper<ShuiziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiziyuanVO selectVO(Wrapper<ShuiziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiziyuanView> selectListView(Wrapper<ShuiziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiziyuanView selectView(Wrapper<ShuiziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShuiziyuanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShuiziyuanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShuiziyuanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
