package com.entity.view;

import com.entity.DiscussshuiziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水资源评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 22:18:53
 */
@TableName("discussshuiziyuan")
public class DiscussshuiziyuanView  extends DiscussshuiziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshuiziyuanView(){
	}
 
 	public DiscussshuiziyuanView(DiscussshuiziyuanEntity discussshuiziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussshuiziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
