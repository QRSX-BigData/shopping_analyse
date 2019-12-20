package com.bigdata.shopping_analyse.pojo;

/**
 * 账号信息表
 * @author acer-pc
 *
 */
public class Account {
	// 用户名
    private String username;
    // 密码
    private String password;
    // 地址
    private String address;
    // 练习电话
    private String phone;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
