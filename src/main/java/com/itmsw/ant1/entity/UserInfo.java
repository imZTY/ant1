package com.itmsw.ant1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 15:16
 */
@Data
public class UserInfo extends PageEntity implements Serializable {

    private Integer id;

    private Integer roleId;

    // 这是验证码？
    private String loginCode;

    private String password;

    private String passwordSrc;

    private String userName;

    private String phone;

    private String sex;

    private Integer disabled;
}
