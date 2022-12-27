package com.mit.c301.vo;

public class ErpVO {
	
	private String code;	//제품코드
	private String name;	//제품이름
	private Integer firstcost;	//제품원가
	private int targetcount;//목표수량
	private int stock;		//재고수량
	private int factoryprice;//출고가
	private String groupcode;//그룹코드
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstcost() {
		return firstcost;
	}
	public void setFirstcost(int firstcost) {
		this.firstcost = firstcost;
	}
	public int getTargetcount() {
		return targetcount;
	}
	public void setTargetcount(int targetcount) {
		this.targetcount = targetcount;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getFactoryprice() {
		return factoryprice;
	}
	public void setFactoryprice(int factoryprice) {
		this.factoryprice = factoryprice;
	}
	public String getGroupcode() {
		return groupcode;
	}
	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}
	
	

}
