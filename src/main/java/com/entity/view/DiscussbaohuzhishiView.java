package com.entity.view;

import com.entity.DiscussbaohuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保护知识评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 22:18:54
 */
@TableName("discussbaohuzhishi")
public class DiscussbaohuzhishiView  extends DiscussbaohuzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaohuzhishiView(){
	}
 
 	public DiscussbaohuzhishiView(DiscussbaohuzhishiEntity discussbaohuzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaohuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
