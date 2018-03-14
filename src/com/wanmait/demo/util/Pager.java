package com.wanmait.demo.util;

public class Pager {

	private int pageNo;
	private int pageSize;

	private int dataCount;
	public int getPageNo() {		
		if(pageNo>this.getPageCount()) pageNo=this.getPageCount();
		if(pageNo<1) pageNo=1;
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		if(pageSize<1) pageSize=10;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	//总页数
	public int getPageCount() {
	
		return (this.getDataCount()-1)/this.getPageSize()+1;
	}

	public int getDataCount() {
		if(dataCount<0) dataCount=0;
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	//上一页
	public int getPrevPageNo()
	{
		if(pageNo==1) return 1;
		return pageNo-1;
	}
	//下一页
	public int getNextPageNo()
	{
		if(pageNo==this.getPageCount()) return this.getPageCount();
		return pageNo+1;
	}
}









