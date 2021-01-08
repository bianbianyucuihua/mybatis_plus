package com.hongyi.user.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhou
 * @since 2020-11-24
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
            "username=" + username +
            ", birthday=" + birthday +
            ", sex=" + sex +
            ", address=" + address +
        "}";
    }
}
