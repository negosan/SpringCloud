package com.neusoft.ht.feeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ht.feeservice.model.NeighbourHoodModel;
import com.neusoft.ht.feeservice.service.INeighbourHoodService;


/**模块：供热缴费管理
 * 小区管理管理的控制类
 * @author 黄宇德
 *
 */
@RestController
@RequestMapping(value="/fee/neighbourhood")
public class NeighbourHoodController {

	@Autowired
	private INeighbourHoodService neighbourHoodService = null;


	
	
	//取得所有小区列表，无分页
	@GetMapping(value="/list/all")
	public List<NeighbourHoodModel> getListByAll() throws Exception{
		
		//return rest.getForObject("http://neusofthtservice/fee/neighbourhood", List.class);
		return neighbourHoodService.getListByAll();
	}
}
