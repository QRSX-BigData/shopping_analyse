package com.bigdata.shopping_analyse.pojo;

public class ShoppingCar {
	private int shopping_car_id_key;
	private String user_id;
	private int goods_id;
	private String create_time;
	private String update_time;
	public int getShopping_car_id_key() {
		return shopping_car_id_key;
	}
	public void setShopping_car_id_key(int shopping_car_id_key) {
		this.shopping_car_id_key = shopping_car_id_key;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
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
