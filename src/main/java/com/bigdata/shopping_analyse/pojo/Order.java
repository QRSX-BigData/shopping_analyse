package com.bigdata.shopping_analyse.pojo;

/**
 * 订单表
 * @author acer-pc
 *
 */
public class Order {
	// 主键
	private int order_id_key;
	// 订单号
	private String order_id;
	// 商品id
	private int goods_id;
	// 商品数量
	private int goods_num;
	// 商品价格
	private double goods_price;
	// 创建时间
	private String create_time;
	// 更新时间
	private String update_time;
	// 订单详情
	private OrderDetails orderdetails;
	
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
	public OrderDetails getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}
}
