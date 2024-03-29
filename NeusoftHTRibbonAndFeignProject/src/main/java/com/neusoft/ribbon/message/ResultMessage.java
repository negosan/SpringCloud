package com.neusoft.ribbon.message;

import java.util.List;

//通用返回结果
public class ResultMessage<T> {
	private String status = null;
	private String message = null;
	private int page = 0;
	private int rows = 0;
	private int pageCount = 0;
	private int count=0;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	private T model = null;
	private List<T> list = null;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	} 
	public ResultMessage() {
		
	}
	
	public ResultMessage(String status,String message) {
		this.status=status;
		this.message=message;
	}
	

	public ResultMessage(List<T>list,String status,String message) {
		this.list = list;
		this.status=status;
		this.message=message;
	}
	
	public ResultMessage(T model,String status,String message) {
		this.model = model;
		this.status=status;
		this.message=message;
	}
	
	public ResultMessage(int count,String status,String message) {
		this.count = count;
		this.status=status;
		this.message=message;
	}
	
	public ResultMessage(List<T>list,int rows,int page,int count,int pageCount,String status,String message) {
		this.list = list;
		this.rows = rows;
		this.page = page;
		this.count = count;
		this.pageCount = pageCount;
		this.status = status;
		this.message = message;
	}

	public ResultMessage(int count,int pageCount,List<T> list,String status,String message) {
		this.pageCount = pageCount;
		this.list = list;
		this.count = count;
		this.status=status;
		this.message=message;
	}
	
}
