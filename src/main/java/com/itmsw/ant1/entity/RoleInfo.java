package com.itmsw.ant1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 16:48
 */
@Data
public class RoleInfo implements Serializable {

    private Integer id;

    private String roleName;

    private Integer disabled = 0;
}
