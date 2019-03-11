package com.common.entity;

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

    private String loginCode;

    private String password;

    private String passwordSrc = "123456";

    private String userName;

    private String phone = "暂无";

    private Integer sex = 1;

    private Integer disabled = 0;
}
