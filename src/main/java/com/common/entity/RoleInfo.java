package com.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 16:48
 */
@Data
public class RoleInfo extends PageEntity implements Serializable {

    private Integer id;

    private String roleName;

    private Integer disabled = 0;
}
