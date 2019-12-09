package com.bigdata.shopping_analyse.pojo;

public class Order {
	private int order_id_key;
	private String order_id;
	private int goods_id;
	private int goods_num;
	private double goods_price;
	private String create_time;
	private String update_time;
	public int getOrder_id_key() {
		return order_id_key;
	}
	public void setOrder_id_key(int order_id_key) {
		this.order_id_key = order_id_key;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
}
