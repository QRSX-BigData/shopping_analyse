package com.bigdata.shopping_analyse.pojo;

/**
 * 商品表
 * @author acer-pc
 *
 */
public class Goods {
	// 主键
	private int goods_id_key;
	// 商品名称
	private String goods_name;
	// 商品价格
	private int goods_price;
	// 商品数量
	private int goods_num;
	// 商品分类
	private String goods_type;
	// 创建的id
	private String create_id;
	// 创建的时间
	private String create_time;
	// 更新的id
	private String update_id;
	// 更新的时间
	private String update_time_time;

	public int getGoods_id_key() {
		return goods_id_key;
	}

	public void setGoods_id_key(int goods_id_key) {
		this.goods_id_key = goods_id_key;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public int getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}

	public int getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}

	public String getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String create_id) {
		this.create_id = create_id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}

	public String getUpdate_time_time() {
		return update_time_time;
	}

	public void setUpdate_time_time(String update_time_time) {
		this.update_time_time = update_time_time;
	}

	public String toString() {
		return "Goods [goods_id_key=" + goods_id_key + ", goods_name=" + goods_name + ", goods_price=" + goods_price
				+ ", goods_num=" + goods_num + ", goods_type=" + goods_type + ", create_id=" + create_id
				+ ", create_time=" + create_time + ", update_id=" + update_id + ", update_time_time=" + update_time_time
				+ "]";
	}

}
