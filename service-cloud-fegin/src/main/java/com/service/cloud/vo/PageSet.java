package com.service.cloud.vo;

import java.util.List;

/**
 * 分页结果集
 * 
 * @author liuqs
 *
 */
public class PageSet<T> {
	private Integer start = 0;// 起始行
	private Integer size = 15;// 分页大小

	private int total;// 总记录数
	private List<T> data;// 分页数据

	public PageSet() {

	}

	public PageSet(Integer start, Integer size, Integer total, List<T> data) {
		this.start = start;
		this.size = size;
		this.total = total;
		this.data = data;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
