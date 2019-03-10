package com.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 22:13
 */
@Data
public class PageEntity implements Serializable {

    private int[] ids;

    /**
     * 固定设置为：每页10行
     */
    private int rows = 10;

    private int page;

    private int pageStart;
}
