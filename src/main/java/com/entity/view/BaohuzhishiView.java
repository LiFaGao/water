package com.entity.view;

import com.entity.BaohuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保护知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
@TableName("baohuzhishi")
public class BaohuzhishiView  extends BaohuzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaohuzhishiView(){
	}
 
 	public BaohuzhishiView(BaohuzhishiEntity baohuzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, baohuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}