package com.bigdata.shopping_analyse.pojo;

/**
 * 用户详情表
 * @author acer-pc
 *
 */
public class User {
	//  主键
    private int user_id_key;
    // 用户名
    private String username;
    // 用户密码
    private String userpwd;
    // 收货地址
    private String address;
    // 交易成功订单数
    private int shopping_success_num;
    // 交易失败 订单数
    private int shopping_fail_num;
    // 总交易额
    private double total_money_shopping_success;
    // 总退款额
    private double total_money_shopping_fail;
    // 最后登陆时间
    private String last_login_time;
    // 创建id
    private String create_id;
    // 创建时间
    private String create_time;
    // 更新id
    private String update_id;
    // 更新时间
    private String update_time_time;
    
	public int getUser_id_key() {
		return user_id_key;
	}
	public void setUser_id_key(int user_id_key) {
		this.user_id_key = user_id_key;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getShopping_success_num() {
		return shopping_success_num;
	}
	public void setShopping_success_num(int shopping_success_num) {
		this.shopping_success_num = shopping_success_num;
	}
	public int getShopping_fail_num() {
		return shopping_fail_num;
	}
	public void setShopping_fail_num(int shopping_fail_num) {
		this.shopping_fail_num = shopping_fail_num;
	}
	public double getTotal_money_shopping_success() {
		return total_money_shopping_success;
	}
	public void setTotal_money_shopping_success(double total_money_shopping_success) {
		this.total_money_shopping_success = total_money_shopping_success;
	}
	public double getTotal_money_shopping_fail() {
		return total_money_shopping_fail;
	}
	public void setTotal_money_shopping_fail(double total_money_shopping_fail) {
		this.total_money_shopping_fail = total_money_shopping_fail;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
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
    
}