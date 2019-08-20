package com.neusoft.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ribbon.message.ResultMessage;
import com.neusoft.ribbon.model.NeighbourHoodModel;
import com.neusoft.ribbon.service.INeighbourHoodService;

@RestController
@RequestMapping("/api/neighbourhood")
public class NeighbourHoodController {

	@Autowired
	private INeighbourHoodService neighbourHoodService = null;
	@RequestMapping("/list/all")
	public ResultMessage<NeighbourHoodModel> getList() throws Exception{
		
		ResultMessage<NeighbourHoodModel> result=neighbourHoodService.getListByAll();
		if(!result.getStatus().equals("ERROR")) {
			//取对象个数。。。
		}
		return result;
	}
}
