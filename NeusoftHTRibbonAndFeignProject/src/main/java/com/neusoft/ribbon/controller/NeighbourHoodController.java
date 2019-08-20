package com.neusoft.ribbon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ribbon.model.NeighbourHoodModel;
import com.neusoft.ribbon.service.INeighbourHoodService;

@RestController
@RequestMapping("/api/neighbourhood")
public class NeighbourHoodController {

	@Autowired
	private INeighbourHoodService neighbourHoodService = null;
	@RequestMapping("/list/all")
	public List<NeighbourHoodModel> getList() throws Exception{
		return neighbourHoodService.getListByAll();
	}
}
