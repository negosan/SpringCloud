package com.neusoft.ribbon.service;

import java.util.List;

import com.neusoft.ribbon.message.ResultMessage;
import com.neusoft.ribbon.model.NeighbourHoodModel;

/**模块：供热缴费管理
 * 小区管理的Service接口
 * @author 黄宇德
 *
 */
public interface INeighbourHoodService {
	
	//取得所有小区
	public ResultMessage<NeighbourHoodModel> getListByAll() throws Exception;
	
	

}
