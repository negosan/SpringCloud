package com.neusoft.ribbon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neusoft.ribbon.model.NeighbourHoodModel;
import com.neusoft.ribbon.service.INeighbourHoodService;
/**模块：供热缴费管理
 * 小区管理的Service实现类
 * @author 黄宇德
 *
 */
@Service
public class NeighbourHoodServiceImpl implements INeighbourHoodService {


	@Autowired
	private RestTemplate rest=null;

	@Override

	public List<NeighbourHoodModel> getListByAll() throws Exception {
		
		List<NeighbourHoodModel> list = rest.getForObject("http://neusofthtservice/fee/neighbourhood/list/all", List.class);
		return list;
	}

	


}
