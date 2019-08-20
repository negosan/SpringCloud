package com.neusoft.ribbon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.neusoft.ribbon.message.ResultMessage;
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
	@HystrixCommand(fallbackMethod = "getListByAllError")
	public ResultMessage<NeighbourHoodModel> getListByAll() throws Exception {
		
		List<NeighbourHoodModel> list = rest.getForObject("http://neusofthtservice/fee/neighbourhood/list/all", List.class);
		ResultMessage<NeighbourHoodModel> result = new ResultMessage<NeighbourHoodModel>("OK","取得小区列表成功");
		result.setList(list);
		//Thread.sleep(20000);
		return result;
	}
	
	public ResultMessage<NeighbourHoodModel> getListByAllError() throws Exception {
		ResultMessage<NeighbourHoodModel> result = new ResultMessage<NeighbourHoodModel>("ERROR","取得小区列表失败");
		return result;
	}
	
	

	


}
